package com.ouyaaa.common.upms.dto;/**
 * @Author Administrator
 * @Date 2018/8/30 17:41
 */

import com.ouyaaa.common.upms.entity.SysUser;
import lombok.Data;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-08-30  17:41
 * @Description：
 **/

@Data
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 用户基本信息
     */
    private SysUser sysUser;


    /**
     * 用户角色信息
     */
    private String[] roles;

    /**
     * 用户权限信息
     */
    private String[] permissions;


    @Override
    public String toString() {
        return "UserInfo{" +
                "sysUser=" + sysUser +
                ", roles=" + Arrays.toString(roles) +
                ", permissions=" + Arrays.toString(permissions) +
                '}';
    }
}