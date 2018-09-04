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
@TableName("basis_machine")
public class Machine extends Model<Machine> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "machine_id", type = IdType.AUTO)
    private Integer machineId;
    private String machineCode;
    private String machineName;
    private String machinePrivoder;
    private Double machinePrice;
    private Integer typeId;
    private Date arrivalTime;
    private Date updateTime;
    private String updateBy;


    @Override
    protected Serializable pkVal() {
        return this.machineId;
    }

}
