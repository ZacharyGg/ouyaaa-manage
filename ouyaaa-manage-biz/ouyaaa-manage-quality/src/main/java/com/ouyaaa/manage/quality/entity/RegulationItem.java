package com.ouyaaa.manage.quality.entity;

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
@TableName("quality_regulation_item")
public class RegulationItem extends Model<RegulationItem> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "regu_id", type = IdType.AUTO)
    private Integer reguId;
    private String reguType;
    private String reguCode;
    private String reguName;
    private Integer reguCycle;
    private Integer cycleUnit;
    private String reguVersion;
    private String statusCode;
    private String machineCode;
    private String machineType;
    private String updateBy;
    private Date updateTime;
    private Date createTime;


    @Override
    protected Serializable pkVal() {
        return this.reguId;
    }

}
