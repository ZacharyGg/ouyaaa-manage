package com.ouyaaa.manage.equipment.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.Version;
import java.io.Serializable;
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
@TableName("equipment_lubricate_result_overview")
public class LubricateResultOverview extends Model<LubricateResultOverview> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "overview_id", type = IdType.AUTO)
    private Integer overviewId;
    private String lubricateCode;
    private String reguCode;
    private String machineCode;
    private String workCode;
    private Date lubricateDate;
    private Integer lubricateTeam;
    private Integer lubricateShift;
    private String lubricateBy;
    private Date lubricateTime;
    private Integer qualifiedCount;
    private Integer unqualifiedCount;
    private Integer statusCode;
    private String updateBy;
    private Date updateTime;


    @Override
    protected Serializable pkVal() {
        return this.overviewId;
    }

}
