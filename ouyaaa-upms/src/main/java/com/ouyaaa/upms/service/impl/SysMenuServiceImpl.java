package com.ouyaaa.upms.service.impl;/**
 * @Author Administrator
 * @Date 2018/8/30 16:49
 */

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ouyaaa.common.upms.dto.MenuTree;
import com.ouyaaa.common.upms.entity.SysMenu;
import com.ouyaaa.upms.core.Util.TreeUtil;
import com.ouyaaa.upms.mapper.SysMenuMapper;
import com.ouyaaa.upms.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-08-30  16:49
 * @Description：
 **/

@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements SysMenuService {

    @Autowired
    SysMenuMapper sysMenuMapper;

    /**
     * 增加菜单
     * @param entity
     * @return
     */
    @Override
    public boolean insert(SysMenu entity) {
        return super.insert(entity);
    }

    /**
     * 删除菜单
     * @param id
     * @return
     */
    @Override
    public boolean deleteById(Serializable id) {
        return super.deleteById(id);
    }

    /**
     * 修改菜单
     * @param entity
     * @return
     */
    @Override
    public boolean updateById(SysMenu entity) {
        return super.updateById(entity);
    }

    /**
     * 根据ID查询菜单
     * @param id
     * @return
     */
    @Override
    public SysMenu selectById(Serializable id) {
        return super.selectById(id);
    }

    /**
     * 根据条件查询菜单
     * @param wrapper
     * @return
     */
    @Override
    public Map<String, Object> selectMap(Wrapper<SysMenu> wrapper) {
        return super.selectMap(wrapper);
    }


    /**
     * 通过角色ID查询菜单
     * @param roleId
     * @return
     */
    @Override
    public List<SysMenu> selectListByRoleId(Integer roleId) {
        return sysMenuMapper.selectListByRoleId(roleId);
    }

    /**
     * 通过角色编码查询菜单
     * @param roleCode
     * @return
     */
    @Override
    public List<SysMenu> selectListByRoleCode(String roleCode) {
        return sysMenuMapper.selectListByRoleCode(roleCode);
    }


    /**
     * 获取菜单树
     * @param sysMenuEntityWrapper
     * @return
     */
    @Override
    public List<MenuTree> selectListTree(EntityWrapper<SysMenu> sysMenuEntityWrapper) {
        sysMenuEntityWrapper.orderBy("menu_sort",false);

        return getListTree(this.selectList(sysMenuEntityWrapper),0) ;
    }

    /**
     * 构建菜单树
     * @param sysMenus
     * @param root
     * @return
     */
    private List<MenuTree> getListTree(List<SysMenu> sysMenus, Integer root){
        List<MenuTree> menuTrees = new ArrayList<>();
        MenuTree node ;
        for(SysMenu menu: sysMenus){
            if (menu.getParentId().equals(menu.getMenuId())){
                continue;
            }
            node = new MenuTree();
            node.setName(menu.getMenuName());
            node.setId(menu.getMenuId());
            node.setParentId(menu.getMenuId());
            menuTrees.add(node);
        }
        return TreeUtil.build(menuTrees,root);
    }
}
