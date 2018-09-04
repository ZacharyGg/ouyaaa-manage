package com.ouyaaa.manage.equipment.core.constant;

/**
 * @Author Administrator
 * @Date 2018/8/31 10:58
 */
public interface CommConstant {

    /**
     * 删除标记，由于数据库采用的是非删除设计，删除的信息统一设置将该状态设置为1
     */
    String STATUS_DEL = "1";
    /**
     * 正常标记
     */
    String STATUS_NORMAL = "0";
}
