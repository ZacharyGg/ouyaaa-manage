package com.ouyaaa.upms.mapper;/**
 * @Author Administrator
 * @Date 2018/8/30 16:39
 */

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ouyaaa.common.upms.entity.SysRole;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-08-30  16:39
 * @Description：
 **/

public interface SysRoleMapper extends BaseMapper<SysRole> {

    /**
     * 根据用户ID查询角色列表
     * @param userId
     * @return
     */
    List<SysRole> selectListByUserId (Integer id);
}
