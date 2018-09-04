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
@TableName("sys_role")
public class SysRole extends Model<SysRole> {
    private static final long serialVersionUID = 1L;



    /**
     * 角色ID
     */
    @TableId(type = IdType.AUTO)
    private Integer roleId;

    /**
     *角色编码
     */
    private String roleCode;

    /**
     *角色名称
     */
    private String roleName;
    
    /**
     *角色描述
     */
    private String roleDesc;

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
        return this.roleId;
    }

    @Override
    public String toString() {
        return "SysRole{" +
                "roleId='" + roleId + '\'' +
                ", roleCode='" + roleCode + '\'' +
                ", roleName='" + roleName + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                ", delFlag='" + delFlag + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
