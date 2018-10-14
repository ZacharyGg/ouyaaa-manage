package com.ouyaaa.auth.service;/**
 * @Author Administrator
 * @Date 2018/8/29 16:45
 */

import com.ouyaaa.auth.fallback.RemoteUserServiceFallbackImpl;
import com.ouyaaa.common.upms.dto.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-08-29  16:45
 * @Description：
 **/
@FeignClient(name = "OUYAAA-UPMS",fallback = RemoteUserServiceFallbackImpl.class)
public interface RemoteUserService {
    @RequestMapping(value = "/user/info/{username}",method = RequestMethod.GET)
    UserInfo getUserInfo(@PathVariable("username") String username);
}
