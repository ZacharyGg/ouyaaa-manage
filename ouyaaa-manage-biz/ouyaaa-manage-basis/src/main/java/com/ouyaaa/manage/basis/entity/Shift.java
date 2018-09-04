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
@TableName("basis_shift")
public class Shift extends Model<Shift> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "shift_id", type = IdType.AUTO)
    private Integer shiftId;
    private String shiftCode;
    private String shiftName;
    private Date startTime;
    private Date endTime;
    private Date continueTime;
    private Integer isEnable;
    private Date updateTime;
    private String updateBy;


    @Override
    protected Serializable pkVal() {
        return this.shiftId;
    }

}
