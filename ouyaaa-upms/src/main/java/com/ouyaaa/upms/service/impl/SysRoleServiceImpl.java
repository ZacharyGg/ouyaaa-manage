package com.ouyaaa.upms.service.impl;/**
 * @Author Administrator
 * @Date 2018/8/30 16:48
 */

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ouyaaa.common.upms.entity.SysMenu;
import com.ouyaaa.common.upms.entity.SysRole;
import com.ouyaaa.upms.mapper.SysRoleMapper;
import com.ouyaaa.upms.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-08-30  16:48
 * @Description：
 **/

@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper,SysRole> implements SysRoleService {


    @Autowired
    SysRoleMapper sysRoleMapper;

    /**
     * 添加角色
     * @param entity
     * @return
     */
    @Override
    public boolean insert(SysRole entity) {
        return super.insert(entity);
    }

    /**
     * 删除角色
     * @param id
     * @return
     */
    @Override
    public boolean deleteById(Serializable id) {
        return super.deleteById(id);
    }

    /**
     * 更新角色
     * @param entity
     * @return
     */
    @Override
    public boolean updateById(SysRole entity) {
        return super.updateById(entity);
    }

    /**
     * 根据ID查询角色
     * @param id
     * @return
     */
    @Override
    public SysRole selectById(Serializable id) {
        return super.selectById(id);
    }

    /**
     * 根据条件查询角色
     * @param wrapper
     * @return
     */
    @Override
    public List<SysRole> selectList(Wrapper<SysRole> wrapper) {
        return super.selectList(wrapper);
    }


    /**
     * 根据用户ID查询角色列表
     * @param userId
     * @return
     */
    @Override
    public List<SysRole> selectListByUserId(Integer userId) {
        return sysRoleMapper.selectListByUserId(userId);
    }

}
