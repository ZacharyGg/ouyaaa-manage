package com.ouyaaa.upms.service.impl;/**
 * @Author Administrator
 * @Date 2018/8/30 16:49
 */

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ouyaaa.upms.core.Util.TreeUtil;
import com.ouyaaa.upms.core.constant.CommConstant;
import com.ouyaaa.common.upms.dto.DeptTree;
import com.ouyaaa.common.upms.entity.SysDept;
import com.ouyaaa.upms.mapper.SysDeptMapper;
import com.ouyaaa.upms.service.SysDeptService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-08-30  16:49
 * @Description：
 **/

@Service
public class SysDeptServiceImpl extends ServiceImpl<SysDeptMapper, SysDept> implements SysDeptService{

    /**
     * 添加部门
     * @param entity
     * @return
     */
    @Override
    public boolean insert(SysDept entity) {
        return super.insert(entity);
    }

    /**
     * 删除部门
     * @param id
     * @return
     */
    @Override
    public boolean deleteById(Serializable id) {
        SysDept dept = new SysDept();
        dept.setDeptId((int)id);
        dept.setDelFlag(CommConstant.STATUS_DEL);
        dept.setUpdateTime(new Date());
        return this.updateById(dept);
    }

    /**
     * 更新部门
     * @param entity
     * @return
     */
    @Override
    public boolean updateById(SysDept entity) {
        return super.updateById(entity);
    }

    /**
     * 根据ID查询部门
     * @param id
     * @return
     */
    @Override
    public SysDept selectById(Serializable id) {
        return super.selectById(id);
    }

    /**
     * 根据条件查询部门
     * @param wrapper
     * @return
     */
    @Override
    public List<SysDept> selectList(Wrapper<SysDept> wrapper) {
        return super.selectList(wrapper);
    }


    /**
     * 查询部门树
     * @param sysDeptEntityWrapper
     * @return
     */
    @Override
    public List<DeptTree> selectListTree(EntityWrapper<SysDept> sysDeptEntityWrapper) {
        sysDeptEntityWrapper.orderBy("order_num",false);
        return getDeptTree(this.selectList(sysDeptEntityWrapper),1);
    }

    /**
     * 构建部门树
     * @param depts
     * @param root
     * @return
     */
    private List<DeptTree> getDeptTree(List<SysDept> depts, Integer root){
        List<DeptTree> trees = new ArrayList<>();
        DeptTree node;
        for(SysDept dept : depts){
            if (dept.getParentId().equals(dept.getDeptId())){
                continue;
            }
            node = new DeptTree();
            node.setId(dept.getDeptId());
            node.setName(dept.getDeptName());
            node.setParentId(dept.getParentId());
            trees.add(node);
        }
        return TreeUtil.build(trees,root);
    }
}
