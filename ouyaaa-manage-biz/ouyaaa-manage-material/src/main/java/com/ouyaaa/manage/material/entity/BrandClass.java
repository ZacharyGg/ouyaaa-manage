package com.ouyaaa.manage.material.entity;

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
@TableName("material_brand_class")
public class BrandClass extends Model<BrandClass> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "material_id", type = IdType.AUTO)
    private Integer materialId;
    private String materialCode;
    private String materialName;
    private String brandCode;
    private Integer isEnable;
    private String updateBy;
    private Date updateTime;


    @Override
    protected Serializable pkVal() {
        return this.materialId;
    }

}
