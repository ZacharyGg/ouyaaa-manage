package com.ouyaaa.manage.produce.entity;

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
@TableName("product_personnel")
public class Personnel extends Model<Personnel> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "personnel_id", type = IdType.AUTO)
    private Integer personnelId;
    private String machineCode;
    private Date produceDate;
    private Integer produceShift;
    private Integer personelCode;
    private Integer isEnable;
    private String updateBy;
    private Date updateTime;


    @Override
    protected Serializable pkVal() {
        return this.personnelId;
    }

}
