package com.ouyaaa.upms.service.impl;/**
 * @Author Administrator
 * @Date 2018/8/30 16:48
 */

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ArrayUtil;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.toolkit.StringUtils;
import com.ouyaaa.manage.basis.entity.Shift;
import com.ouyaaa.upms.core.constant.CommConstant;
import com.ouyaaa.common.upms.dto.UserInfo;
import com.ouyaaa.common.upms.entity.SysMenu;
import com.ouyaaa.common.upms.entity.SysRole;
import com.ouyaaa.common.upms.entity.SysUser;
import com.ouyaaa.upms.mapper.SysUserMapper;
import com.ouyaaa.upms.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-08-30  16:48
 * @Description：
 **/

@Slf4j
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper,SysUser> implements SysUserService {

    @Autowired
    SysRoleService sysRoleService;

    @Autowired
    SysMenuService sysMenuService;

    /**
     * 获取用户所有信息
     * @param username 用户名
     * @return
     */
    @Override
    @Cacheable(value = "user_details", key = "#username")
    public UserInfo findUserInfo(String username) {
        SysUser sysUser = new SysUser();
        sysUser.setUserName(username);
        sysUser = this.selectOne(new EntityWrapper<>(sysUser));

        UserInfo userInfo = new UserInfo();
        userInfo.setSysUser(sysUser);

        //获取用户角色信息，需要代码编写
        List<SysRole> roleList = sysRoleService.selectListByUserId(sysUser.getUserId());

        List<String> roleCodes = new ArrayList<>();
        if(CollUtil.isNotEmpty(roleList)){
            roleList.forEach(sysRole -> roleCodes.add(sysRole.getRoleCode()));
        }
        userInfo.setRoles(ArrayUtil.toArray(roleCodes,String.class));

        //获取菜单列表
        Set<SysMenu> menuSet = new HashSet<>();
        for (String role : roleCodes){
            List<SysMenu> menus =  sysMenuService.selectListByRoleCode(role);
            menuSet.addAll(menus);
        }
        List<String> permissions = new ArrayList<>();
        for (SysMenu sysMenu : menuSet){
            if(StringUtils.isNotEmpty(sysMenu.getMenuPermission())){
                String permission = sysMenu.getMenuPermission();
                permissions.add(permission);
            }
        }

        log.info("是否从缓存中获取");
        userInfo.setPermissions(ArrayUtil.toArray(permissions,String.class));
        return userInfo;
    }

    /**
     * 根据用户ID查询用户信息
     * @param id
     * @return
     */
    @Override
    public SysUser selectById(Serializable id) {
        return super.selectById(id);
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @Override
    @CacheEvict(value = "user_details", key = "#username")
    public boolean deleteById(Serializable id) {
        SysUser sysUser = new SysUser();
        sysUser.setUserId((Integer)id);
        sysUser.setDelFlag(CommConstant.STATUS_DEL);
        sysUser.setUpdateTime(new Date());
        return this.updateById(sysUser);
    }

    /**
     * 增加用户
     * @param entity
     * @return
     */
    @Override
    public boolean insert(SysUser entity) {
        return super.insert(entity);
    }


    /**
     * 更新用户
     * @param entity
     * @return
     */
    @Override
    @CacheEvict(value = "user_details", key = "#username")
    public boolean updateById(SysUser entity) {
        return super.updateById(entity);
    }



    @Autowired
    RemoteShiftService remoteShiftService;

    @Transactional(rollbackFor = Exception.class)
    public void insertUserAddShiftAddBrand(SysUser sysUser){


        Boolean userOk =  insert( sysUser );
        if(!userOk){
            try {
                throw new Exception("用户插入失败");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Shift shift = new Shift();
        shift.setShiftCode( "abcd" );
        shift.setShiftName( "nnnn" );
        Boolean shiftOk = remoteShiftService.insertShiftInfo( shift );
        if (!shiftOk){
            try {
                throw new Exception("班次插入失败");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
