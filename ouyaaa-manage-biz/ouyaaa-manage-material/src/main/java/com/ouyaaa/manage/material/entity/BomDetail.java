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
@TableName("material_bom_detail")
public class BomDetail extends Model<BomDetail> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "materila_id", type = IdType.AUTO)
    private Integer materilaId;
    private String parentCode;
    private String parentName;
    private String materilaCode;
    private String materilaName;
    private Integer bomId;
    private String materilaValue;
    private String materilaUnit;
    private Integer isEnable;
    private String updateBy;
    private Date updateTime;


    @Override
    protected Serializable pkVal() {
        return this.materilaId;
    }

}
