package com.ouyaaa.upms.annotation;/**
 * @Author Administrator
 * @Date 2018/8/31 18:03
 */

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-08-31  18:03
 * @Description：操作日志注解
 **/

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {

    /**
     * 注解描述
     * @return
     */
    String value();
}
