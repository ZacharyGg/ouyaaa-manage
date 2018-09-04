package com.ouyaaa.manage.quality.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.querys.Blob;
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
@TableName("quality_checkpoint_item")
public class CheckpointItem extends Model<CheckpointItem> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "item_id", type = IdType.AUTO)
    private Integer itemId;
    private String itemCode;
    private String itemName;
    private String itemPart;
    private String itemContent;
    private String itemStandart;
    private Integer itemCycle;
    private Integer cycleUnit;
    private String reguCode;
    private Double xAxis;
    private Double yAxis;
    private Double zAxis;
    private String dCode;
    private Integer statusCode;
    private String updateBy;
    private Blob updateTime;


    @Override
    protected Serializable pkVal() {
        return this.itemId;
    }

}
