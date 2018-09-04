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
@TableName("quality_checkpoint_result_overview")
public class CheckpointResultOverview extends Model<CheckpointResultOverview> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "overview_id", type = IdType.AUTO)
    private Integer overviewId;
    private String checkCode;
    private String reguCode;
    private String machineCode;
    private String workCode;
    private Date checkDate;
    private Integer checkTeam;
    private Integer checkShift;
    private String checkBy;
    private Date checkTime;
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
