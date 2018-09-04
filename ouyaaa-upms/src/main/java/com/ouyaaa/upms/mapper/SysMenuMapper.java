package com.ouyaaa.upms.mapper;/**
 * @Author Administrator
 * @Date 2018/8/30 16:39
 */

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ouyaaa.common.upms.entity.SysMenu;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-08-30  16:39
 * @Description：
 **/

public interface SysMenuMapper extends BaseMapper<SysMenu> {

    /**
     * 根据角色ID获取菜单列表
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

}
