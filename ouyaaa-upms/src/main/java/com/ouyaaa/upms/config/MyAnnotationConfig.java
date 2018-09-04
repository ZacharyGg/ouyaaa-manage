package com.ouyaaa.upms.config;/**
 * @Author Administrator
 * @Date 2018/9/1 16:13
 */

import com.ouyaaa.upms.aspect.SysLogAspect;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-09-01  16:13
 * @Description：
 **/

@Configuration
@ConditionalOnWebApplication
public class MyAnnotationConfig {
    @Bean
    public SysLogAspect sysLogAspect(){
        return new SysLogAspect();
    }
}
