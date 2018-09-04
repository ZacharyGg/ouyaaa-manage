package com.ouyaaa.auth.service.impl;/**
 * @Author Administrator
 * @Date 2018/8/29 16:46
 */

import cn.hutool.core.util.ArrayUtil;
import com.ouyaaa.auth.service.RemoteUserService;
import com.ouyaaa.common.upms.dto.UserInfo;
import com.ouyaaa.common.upms.entity.SysUser;
import org.apache.commons.codec.binary.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-08-29  16:46
 * @Description：
 **/
@Service
public class UserDetailsServiceImpl  implements UserDetailsService{

    @Autowired
    private RemoteUserService remoteUserService;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo user = remoteUserService.getUserInfo(username);
        if (user == null) {
            throw new UsernameNotFoundException("用户不存在");
        }

//        UserInfo result = remoteUserService.getUser(username);
//        if (result == null || result.getData() ==null ){
//            throw  new UsernameNotFoundException("用户不存在");
//        }
//        UserInfo user = result.getData();
        Set<String> dbOauthSet = new HashSet<>();

        if (ArrayUtil.isNotEmpty(user.getRoles())){
            // 获取角色
            Arrays.stream(user.getRoles()).forEach(role -> dbOauthSet.add(role));
            //获取资源
            dbOauthSet.addAll(Arrays.asList(user.getPermissions()));
        }

        Collection<? extends GrantedAuthority> authorities
                = AuthorityUtils.createAuthorityList(dbOauthSet.toArray(new String[0]));

        SysUser sysUser = user.getSysUser();


        boolean enabled = StringUtils.equals(sysUser.getDelFlag(),"0");

        /*
        * 构造security用户
        * */
        return new User(username,"{noop}"+sysUser.getUserPwd(),true,true,true,true,authorities);
    }
}
