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
@TableName("sys_user")
public class SysUser extends Model<SysUser>{
    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId(type = IdType.AUTO)
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPwd;

    /**
     * 用户部门ID
     */
    private Integer userDept;

    /**
     * 用户密码盐
     */
    private String userSalt;

    /**
     * 用户电话
     */
    private String userPhone;

    /**
     * 用户头像
     */
    private String userAvatar;

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
        return this.userId;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userDept=" + userDept +
                ", userSalt='" + userSalt + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userAvatar='" + userAvatar + '\'' +
                ", delFlag='" + delFlag + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
