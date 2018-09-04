package com.ouyaaa.upms.service;

import com.baomidou.mybatisplus.service.IService;
import com.ouyaaa.common.upms.entity.SysMenu;
import com.ouyaaa.common.upms.entity.SysRole;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2018/8/30 16:45
 */
public interface SysRoleService  extends IService<SysRole>{


    /**
     * 根据用户ID查询角色列表
     * @param id
     * @return
     */
    List<SysRole> selectListByUserId(Integer id);


}
