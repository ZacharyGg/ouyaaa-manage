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
@TableName("basis_team")
public class Team extends Model<Team> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "team_id", type = IdType.AUTO)
    private Integer teamId;
    private String teamCode;
    private String teamName;
    private Integer isEnable;
    private Date updateTime;
    private String updateBy;


    @Override
    protected Serializable pkVal() {
        return this.teamId;
    }

}
