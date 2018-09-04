package com.ouyaaa.upms.util;/**
 * @Author Administrator
 * @Date 2018/9/1 15:34
 */





import cn.hutool.core.util.URLUtil;
import cn.hutool.http.HttpUtil;

import com.ouyaaa.upms.core.constant.CommConstant;
import com.ouyaaa.common.upms.entity.SysLog;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-09-01  15:34
 * @Description：
 **/

public class SysLogUtils {

    public static SysLog getSysLog(){
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();


        SysLog sysLog = new SysLog();
        sysLog.setCreateUser("admin");
        sysLog.setLogType(CommConstant.STATUS_NORMAL);
        sysLog.setRemoteAddress(HttpUtil.getClientIP(request));
        sysLog.setRequestUri(URLUtil.getPath(request.getRequestURI()));
        sysLog.setRequestMethod(request.getMethod());
        sysLog.setUserAgent(request.getHeader("user-agent"));
        sysLog.setRequestParams(HttpUtil.toParams(request.getParameterMap()));
        sysLog.setServiceId("ceshi");
        return sysLog;
    }
}
