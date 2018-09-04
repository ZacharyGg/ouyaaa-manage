package com.ouyaaa.auth.propertis;/**
 * @Author Administrator
 * @Date 2018/8/29 15:29
 */

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-08-29  15:29
 * @Description：
 **/


/**
 * 对{@link AuthProperties 的属性进行封装}
 * 对{@link AuthClientProperties 的属性进行封装}
 * 统一可在配置文件中进行数据配置
 */
@ConfigurationProperties(prefix = "ouyaaa.security")
public class SecurityProperties {


    private AuthProperties oauth = new AuthProperties();

    public AuthProperties getOauth() {
        return oauth;
    }

    public void setOauth(AuthProperties oauth) {
        this.oauth = oauth;
    }
}
