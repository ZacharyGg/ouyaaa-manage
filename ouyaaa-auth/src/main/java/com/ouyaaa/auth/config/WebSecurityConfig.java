package com.ouyaaa.auth.config;/**
 * @Author Administrator
 * @Date 2018/8/29 15:30
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-08-29  15:30
 * @Description：
 **/

@Primary
@Order(100)
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * Spring Security的安全基础配置
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/actuator/**", "/oauth/removeToken","/shift/**").permitAll()
                .anyRequest().authenticated()
                .and().csrf().disable();
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}
