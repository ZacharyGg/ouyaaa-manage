package com.ouyaaa.auth.config;/**
 * @Author Administrator
 * @Date 2018/8/29 15:28
 */

import cn.hutool.core.util.ArrayUtil;
import com.ouyaaa.auth.propertis.AuthClientProperties;
import com.ouyaaa.auth.propertis.SecurityProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.config.annotation.builders.InMemoryClientDetailsServiceBuilder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-08-29  15:28
 * @Description：
 **/
@Configuration
@EnableAuthorizationServer
public class AuthServerConfig extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private SecurityProperties securityProperties;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenStore tokenStore;

    @Autowired
    private UserDetailsService userDetailsService;

    /**
     * 对AuthorizationServer进行配置，包括授权模式、scope、Client pw
     * @param clients
     * @throws Exception
     */
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        InMemoryClientDetailsServiceBuilder builder =clients.inMemory();
        if(ArrayUtil.isNotEmpty(securityProperties.getOauth().getClients())){
            for (AuthClientProperties config : securityProperties.getOauth().getClients()){
                builder.withClient(config.getClientId())
                        .secret("{noop}"+config.getClientSecret())
                        .accessTokenValiditySeconds(config.getValiditySeconds())
                        .refreshTokenValiditySeconds(config.getRefreshSeconds())
                        .authorizedGrantTypes("password","refresh_token")
                        .scopes("all","read","write");
            }
        }
    }

    /**
     * 对EndPoint进行配置，读取用户信息
     * @param endpoints
     * @throws Exception
     */
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.allowedTokenEndpointRequestMethods(HttpMethod.GET,HttpMethod.POST)
                .authenticationManager(authenticationManager)
                .userDetailsService(userDetailsService)
                .tokenStore(tokenStore);
    }

    /**
     * 普通的安全认证
     * @param security
     * @throws Exception
     */
    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security.allowFormAuthenticationForClients()
                .tokenKeyAccess("isAuthenticated()")
                .checkTokenAccess("permitAll()");
    }
}
