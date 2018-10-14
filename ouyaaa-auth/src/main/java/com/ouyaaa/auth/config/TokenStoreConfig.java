package com.ouyaaa.auth.config;/**
 * @Author Administrator
 * @Date 2018/8/29 15:30
 */

import com.ouyaaa.auth.propertis.SecurityProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-08-29  15:30
 * @Description：
 **/


@Configuration
public class TokenStoreConfig {

    @Autowired
    private RedisConnectionFactory redisConnectionFactory;
    /**
     * 对Token存储方式进行配置，采用的redis存储
     * @return
     */
    @Bean
    @ConditionalOnProperty(prefix = "ouyaaa.security.oauth", name = "storeType" , havingValue = "redis")
    public TokenStore redisTokenStore(){
        return new RedisTokenStore(redisConnectionFactory);
    }
}
