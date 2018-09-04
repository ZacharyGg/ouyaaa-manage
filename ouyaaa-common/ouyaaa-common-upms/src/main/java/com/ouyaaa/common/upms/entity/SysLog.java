package com.ouyaaa.common.upms.entity;
/**
 * @Author Administrator
 * @Date 2018/9/1 15:48
 */

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-09-01  15:48
 * @Description：
 **/

@Data
public class SysLog implements Serializable{

    private static final long serialVersionUID = 1L;


    /**
     *日志ID
     */
    private int logId;

    /**
     *日志类型
     */
    private String logType;

    /**
     *日志标题
     */
    private String logTitle;

    /**
     *创建者
     */
    private String createUser;

    /**
     *创建时间
     */
    private Date createTime;

    /**
     *更新时间
     */
    private Date updateTime;

    /**
     *服务ID
     */
    private String serviceId;

    /**
     *远程地址
     */
    private String remoteAddress;
    
    /**
     *用户代理
     */
    private String userAgent;
    
    /**
     *请求地址
     */
    private String requestUri;      
    
    /**
     *请求方法
     */
    private String requestMethod;

    /**
     *请求参数
     */
    private String requestParams;

    /**
     *执行时间
     */
    private double excTime;
    
    /**
     *是否有效
     */
    private String delFlag;
    
    /**
     *请求异常
     */
    private String requestException;

    @Override
    public String toString() {
        return "SysLog{" +
                "logId=" + logId +
                ", logType='" + logType + '\'' +
                ", logTitle='" + logTitle + '\'' +
                ", createUser='" + createUser + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", serviceId='" + serviceId + '\'' +
                ", remoteAddress='" + remoteAddress + '\'' +
                ", userAgent='" + userAgent + '\'' +
                ", requestUri='" + requestUri + '\'' +
                ", requestMethod='" + requestMethod + '\'' +
                ", requestParams='" + requestParams + '\'' +
                ", excTime=" + excTime +
                ", delFlag='" + delFlag + '\'' +
                ", requestException='" + requestException + '\'' +
                '}';
    }
}
