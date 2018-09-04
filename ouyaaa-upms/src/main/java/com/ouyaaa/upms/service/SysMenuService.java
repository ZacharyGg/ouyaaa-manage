package com.ouyaaa.upms.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.ouyaaa.common.upms.dto.MenuTree;
import com.ouyaaa.common.upms.entity.SysDept;
import com.ouyaaa.common.upms.entity.SysMenu;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2018/8/30 16:45
 */
public interface SysMenuService extends IService<SysMenu>{

    /**
     * 根据角色获取菜单列表
     * @param roleId
     * @return
     */
    List<SysMenu> selectListByRoleId(Integer roleId);

    /**
     * 根据角色编码获取菜单列表
     * @param roleCode
     * @return
     */
    List<SysMenu> selectListByRoleCode(String roleCode);

    /**
     * 获取菜单树
     * @param sysMenuEntityWrapper
     * @return
     */
    List<MenuTree> selectListTree(EntityWrapper<SysMenu> sysMenuEntityWrapper);
}
