package com.ouyaaa.auth.propertis;/**
 * @Author Administrator
 * @Date 2018/8/29 15:29
 */

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-08-29  15:29
 * @Description：
 **/

/**
 * 用户的基本信息
 */
public class AuthClientProperties {
    private String clientId;
    private String clientSecret;
    private int validitySeconds = 7200;
    private int refreshSeconds =360000000;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public int getValiditySeconds() {
        return validitySeconds;
    }

    public void setValiditySeconds(int validitySeconds) {
        this.validitySeconds = validitySeconds;
    }

    public int getRefreshSeconds() {
        return refreshSeconds;
    }

    public void setRefreshSeconds(int refreshSeconds) {
        this.refreshSeconds = refreshSeconds;
    }
}
