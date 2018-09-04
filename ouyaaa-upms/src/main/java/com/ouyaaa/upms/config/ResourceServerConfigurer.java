package com.ouyaaa.upms.config;/**
 * @Author Administrator
 * @Date 2018/9/1 16:29
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-09-01  16:29
 * @Description：
 **/
@Configuration
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ResourceServerConfigurer extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .and()
                .authorizeRequests()
                .antMatchers(
                        "/actuator/*","/user/info/**")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .csrf().disable() ;
    }
    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {

        super.configure(resources);
    }
}
