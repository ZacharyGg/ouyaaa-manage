package com.ouyaaa.upms.rest;/**
 * @Author Administrator
 * @Date 2018/8/31 9:32
 */

import com.baomidou.mybatisplus.plugins.Page;
import com.ouyaaa.upms.annotation.SysLog;
import com.ouyaaa.common.upms.dto.UserInfo;
import com.ouyaaa.common.upms.entity.SysUser;
import com.ouyaaa.upms.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-08-31  09:32
 * @Description：
 **/

@Api(value = "test", tags = "测试接口")
@RestController
@Slf4j
@RequestMapping("/user")
public class UserInfoRestController {

    @Autowired
    public SysUserService sysUserService;

    /**
     * 获取用户权限信息
     * @param username
     * @return
     */
    @ApiOperation(value="用户信息", notes = "用户信息")
    //@SysLog("查询用户信息")
    @RequestMapping(value = "/info/{username}", method = RequestMethod.GET)
    public UserInfo getUserInfo(@PathVariable String username){

        UserInfo userInfo =sysUserService.findUserInfo(username);
        log.info("查询用户信息：%s", userInfo.toString());
        return userInfo;
    }

    /**
     * 根据用户ID查询用户信息
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public SysUser userById(@PathVariable Integer id){
        return sysUserService.selectById(id);
    }


    /**
     * 删除用户信息
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    @PreAuthorize( "@pms" )
    public Boolean userDel(@PathVariable Integer id){
        return sysUserService.deleteById(id);
    }


    /**
     * 更新用户信息
     * @param sysUser
     * @return
     */
    @PutMapping
    public Boolean userUpdate(@RequestBody SysUser sysUser){
        return sysUserService.updateById(sysUser);
    }

    /**
     * 分页查询用户
     * @param params
     * @return
     */
    @GetMapping("/page")
    public Page usrPage (@RequestParam Map<String, Object> params){
        Page<SysUser> page =new Page<>();
        page.setSize(10);
        return sysUserService.selectPage(page);
    }

    /**
     * 用户校验
     * @param body
     * @return
     */
    @PostMapping("/user/validate")
    public UserInfo validate(@RequestBody Map<String, String> body){
        return  null;
    }
}
