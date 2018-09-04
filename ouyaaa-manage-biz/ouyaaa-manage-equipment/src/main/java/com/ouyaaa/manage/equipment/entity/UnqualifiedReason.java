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
@TableName("equipment_unqualified_reason")
public class UnqualifiedReason extends Model<UnqualifiedReason> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "unqua_id", type = IdType.AUTO)
    private Integer unquaId;
    private String unquaCode;
    private String unquaName;
    private Integer itemId;
    private String resolventCode;
    private String experienceCode;
    private Integer statusCode;
    private String updateBy;
    private Date updateTime;


    @Override
    protected Serializable pkVal() {
        return this.unquaId;
    }

}
