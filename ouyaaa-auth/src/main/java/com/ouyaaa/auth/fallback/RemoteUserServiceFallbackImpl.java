package com.ouyaaa.auth.fallback;/**
 * @Author Administrator
 * @Date 2018/7/23 0:23
 */

import com.ouyaaa.auth.service.RemoteUserService;


import com.ouyaaa.common.upms.dto.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * @Program：ouyaaa-microcloud
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-07-23  00:23
 * @Description：
 **/

@Slf4j
@Component
public class RemoteUserServiceFallbackImpl implements RemoteUserService {

    @Override
    public UserInfo getUserInfo(String username) {
        log.error("feign 查询用户信息失败:{}", username);
        return null;
    }
}
