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
 * 权限基本信息
 */
public class AuthProperties {

    private String jwtSigningKey = "ouyaaa";

    private AuthClientProperties[] clients = {};

    public AuthClientProperties[] getClients() {
        return clients;
    }

    public void setClients(AuthClientProperties[] clients) {
        this.clients = clients;
    }

    public String getJwtSigningKey() {
        return jwtSigningKey;
    }

    public void setJwtSigningKey(String jwtSigningKey) {
        this.jwtSigningKey = jwtSigningKey;
    }
}
