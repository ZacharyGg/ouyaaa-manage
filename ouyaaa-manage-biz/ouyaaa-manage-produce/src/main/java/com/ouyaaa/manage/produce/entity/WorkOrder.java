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
@TableName("product_work_order")
public class WorkOrder extends Model<WorkOrder> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "order_id", type = IdType.AUTO)
    private Integer orderId;
    private String orderCode;
    private Date planDate;
    private Date startTime;
    private Date endTime;
    private Integer produceShift;
    private Integer produceTeam;
    private Integer produceBrand;
    private Integer produceValue;
    private Integer unitCode;
    private String produceStorage;
    private String produceMachine;
    private String upMachine;
    private String downMachine;
    private Integer orderSort;
    private Integer oederStatus;
    private String createBy;
    private Date createTime;
    private String updateBy;
    private Date updateTime;


    @Override
    protected Serializable pkVal() {
        return this.orderId;
    }

}
