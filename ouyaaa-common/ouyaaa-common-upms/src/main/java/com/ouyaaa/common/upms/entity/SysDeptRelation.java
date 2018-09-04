package com.ouyaaa.common.upms.entity;
/**
 * @Author Administrator
 * @Date 2018/8/30 16:40
 */

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-08-30  16:40
 * @Description：
 **/
@Data
@TableName("sys_dept_relation")
public class SysDeptRelation extends Model<SysDeptRelation>{
    private static final long serialVersionUID = 1L;

    /**
     *祖先节点
     */
    private Integer ancestorId;
    
    /**
     *后代节点
     */
    private Integer descendantId;

    @Override
    protected Serializable pkVal() {
        return this.ancestorId;
    }

    @Override
    public String toString() {
        return "SysDeptRelation{" +
                "ancestorId=" + ancestorId +
                ", descendantId=" + descendantId +
                '}';
    }
}
