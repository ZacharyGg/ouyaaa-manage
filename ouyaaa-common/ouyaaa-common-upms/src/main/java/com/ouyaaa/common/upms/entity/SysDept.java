package com.ouyaaa.common.upms.entity;
/**
 * @Author Administrator
 * @Date 2018/8/30 16:39
 */

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-08-30  16:39
 * @Description：
 **/
@Data
@TableName("sys_dept")
public class SysDept extends Model<SysDept> {
    private static final long serialVersionUID = 1L;

    /**
     *部门ID
     */
    @TableId(type = IdType.AUTO)
    private Integer deptId;
    
    /**
     *部门名称
     */
    private String deptName;
    
    /**
     *部门描述
     */
    private String deptDesc;
    
    /**
     *部门排序
     */
    private String orderNum;
    
    /**
     *父部门ID
     */
    private Integer parentId;

    /**
     * 信息标注 0-正常 ，1 -删除
     */
    private String delFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    @Override
    protected Serializable pkVal() {
        return this.deptId;
    }

    @Override
    public String toString() {
        return "SysDept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", deptDesc='" + deptDesc + '\'' +
                ", orderNum='" + orderNum + '\'' +
                ", parentId=" + parentId +
                ", delFlag='" + delFlag + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
