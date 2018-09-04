package com.ouyaaa.upms.service;

import com.baomidou.mybatisplus.service.IService;
import com.ouyaaa.common.upms.dto.UserInfo;
import com.ouyaaa.common.upms.entity.SysUser;

/**
 * @Author Administrator
 * @Date 2018/8/30 16:45
 */
public interface SysUserService extends IService<SysUser>{
    public UserInfo findUserInfo(String username);
}
