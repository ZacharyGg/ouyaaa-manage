package com.ouyaaa.upms.service.impl;

import com.ouyaaa.common.upms.entity.SysUser;
import com.ouyaaa.upms.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author Administrator
 * @Date 2018/8/30 17:59
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserServiceImplTest {

    @Autowired
    SysUserService sysUserService;

    @Test
    public void findUserInfo() throws Exception {
    }

    @Test
    public void selectById() throws Exception {
        System.out.println(sysUserService.selectById(1));
    }

    @Test
    public void deleteById() throws Exception {
        sysUserService.deleteById(1);
    }

    @Test
    public void insert() throws Exception {
        SysUser sysUser = new SysUser();
        sysUser.setUserId(1);
        sysUser.setUserName("张三");
        sysUser.setUserDept(1);
        sysUser.setDelFlag("0");
        sysUser.setUserPhone("123456");
        sysUser.setUserPwd("123456");
        sysUserService.insert(sysUser);
    }

    @Test
    public void updateById() throws Exception {
        SysUser sysUser = new SysUser();
        sysUser.setUserId(1);
        sysUser.setUserPhone("123411111");
        sysUserService.updateById(sysUser);
    }

}