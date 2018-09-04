package com.ouyaaa.manage.basis.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.Version;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Zachary
 * @since 2018-09-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("basis_component")
public class Component extends Model<Component> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "component_id", type = IdType.AUTO)
    private Integer componentId;
    private String parentCode;
    private String componentCode;
    private String componentName;
    private String componentPrivoder;
    private Double componentPrice;
    private Date arrivalTime;
    private Date updateTime;
    private String updateBy;


    @Override
    protected Serializable pkVal() {
        return this.componentId;
    }

}
