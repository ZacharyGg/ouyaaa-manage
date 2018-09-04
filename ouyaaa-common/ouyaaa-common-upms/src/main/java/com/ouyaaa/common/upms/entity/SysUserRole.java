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
@TableName("sys_user_role")
public class SysUserRole extends Model<SysUserRole>{
    private static final long serialVersionUID = 1L;

    /**
     *用户ID
     */
    @TableId(type = IdType.INPUT)
    private Integer userId;

    /**
     *用户ID
     */
    @TableId(type = IdType.INPUT)
    private Integer roleId;

    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

    @Override
    public String toString() {
        return "SysUserRole{" +
                "userId=" + userId +
                ", roleId=" + roleId +
                '}';
    }
}
