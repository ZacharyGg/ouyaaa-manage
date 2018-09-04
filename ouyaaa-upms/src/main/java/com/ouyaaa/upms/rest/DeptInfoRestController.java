package com.ouyaaa.upms.rest;/**
 * @Author Administrator
 * @Date 2018/8/31 10:22
 */

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.ouyaaa.upms.core.constant.CommConstant;
import com.ouyaaa.common.upms.dto.DeptTree;
import com.ouyaaa.common.upms.entity.SysDept;
import com.ouyaaa.upms.service.SysDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-08-31  10:22
 * @Description：
 **/

@RestController
@RequestMapping("/dept")
public class DeptInfoRestController {

    @Autowired
    SysDeptService sysDeptService;

    /**
     * 获取部门信息
     * @param id
     * @return
     */
    @GetMapping({"","/{id}"})
    public SysDept getById(@PathVariable(required = false) Integer id){
        if(id != null){
           return sysDeptService.selectById(id);
        }
        return null;
    }

    /**
     * 获取部门树信息
     * @return
     */
    @GetMapping("/tree")
    public List<DeptTree> getDeptTree(){
        SysDept sysDept = new SysDept();
        sysDept.setDelFlag(CommConstant.STATUS_NORMAL);
        return sysDeptService.selectListTree(new EntityWrapper<>(sysDept));
    }

    /**
     * 增加部门信息
     */
    @PostMapping
    public Boolean insertDept(@RequestBody SysDept sysDept){
        return  sysDeptService.insert(sysDept);
    }


    /**
     * 更新部门信息
     * @param sysDept
     * @return
     */
    @PutMapping
    public Boolean updateDept(@RequestBody SysDept sysDept){
        return sysDeptService.updateById(sysDept);
    }



    /**
     * 删除部门信息
     */
    @DeleteMapping("/{id}")
    public Boolean deleteDept(@PathVariable Integer id){
      return sysDeptService.deleteById(id);
    }

}
