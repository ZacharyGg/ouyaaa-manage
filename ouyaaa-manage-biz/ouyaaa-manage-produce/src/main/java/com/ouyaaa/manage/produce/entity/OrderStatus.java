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
@TableName("product_order_status")
public class OrderStatus extends Model<OrderStatus> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "status_id", type = IdType.AUTO)
    private Integer statusId;
    private String statusCode;
    private String statusName;
    private Integer isEnable;
    private String updateBy;
    private Date updaeTime;


    @Override
    protected Serializable pkVal() {
        return this.statusId;
    }

}
