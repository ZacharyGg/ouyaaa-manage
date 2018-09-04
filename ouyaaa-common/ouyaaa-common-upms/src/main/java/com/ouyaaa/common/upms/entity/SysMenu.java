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
@TableName("sys_menu")
public class SysMenu extends Model<SysMenu>{
    private static final long serialVersionUID = 1L;

    /**
     *菜单ID
     */
    @TableId(type = IdType.AUTO)
    private Integer menuId;
    
    /**
     *菜单名称
     */
    private String menuName;
    
    /**
     *菜单类型
     */
    private String menuType;
    
    /**
     *菜单描述
     */
    private String menuDesc;
    
    /**
     *父菜单ID
     */
    private String parentId;
    
    /**
     *菜单权限
     */
    private String menuPermission;
    
    /**
     *菜单图标
     */
    private String menuIcon;
    
    /**
     *菜单排序
     */
    private String menuSort;
    
    /**
     *菜单页面
     */         
    private String menuComponent;
    
    /**
     *菜单URL
     */
    private String menuPath;


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
        return this.menuId;
    }

    @Override
    public String toString() {
        return "SysMenu{" +
                "menuId='" + menuId + '\'' +
                ", menuName='" + menuName + '\'' +
                ", menuType='" + menuType + '\'' +
                ", menuDesc='" + menuDesc + '\'' +
                ", parentId='" + parentId + '\'' +
                ", menuPermission='" + menuPermission + '\'' +
                ", menuIcon='" + menuIcon + '\'' +
                ", menuSort='" + menuSort + '\'' +
                ", menuComponent='" + menuComponent + '\'' +
                ", menuPath='" + menuPath + '\'' +
                ", delFlag='" + delFlag + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
