package com.ouyaaa.manage.equipment.entity;

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
@TableName("equipment_failure_register")
public class FailureRegister extends Model<FailureRegister> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "failure_id", type = IdType.AUTO)
    private Integer failureId;
    private String failureCode;
    private String failurerName;
    private Date startTime;
    private Date endTime;
    private Date durationTime;
    private String workorderNum;
    private Integer machineCode;
    private Integer shiftCode;
    private Integer teamCode;
    private String producer;


    @Override
    protected Serializable pkVal() {
        return this.failureId;
    }

}
