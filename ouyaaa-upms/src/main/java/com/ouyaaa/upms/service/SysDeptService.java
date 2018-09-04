package com.ouyaaa.upms.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.ouyaaa.common.upms.dto.DeptTree;
import com.ouyaaa.common.upms.entity.SysDept;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2018/8/30 16:45
 */
public interface SysDeptService extends IService<SysDept>{
    List<DeptTree> selectListTree(EntityWrapper<SysDept> sysDeptEntityWrapper);
}
