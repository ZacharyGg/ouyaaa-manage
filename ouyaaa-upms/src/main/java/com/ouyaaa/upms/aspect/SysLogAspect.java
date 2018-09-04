package com.ouyaaa.upms.aspect;/**
 * @Author Administrator
 * @Date 2018/8/31 18:05
 */


import com.ouyaaa.upms.annotation.SysLog;
import com.ouyaaa.upms.util.SysLogUtils;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created with IntelliJ IDEA.
 * @Program：management
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-08-31  18:05
 * @Description：
 **/

@Aspect
@Slf4j
public class SysLogAspect {
    @Around("@annotation(sysLog)")
    public Object aroundLogApi(ProceedingJoinPoint point, SysLog sysLog) throws Throwable {
        String className = point.getTarget().getClass().getName();
        String methodName = point.getSignature().getName();
        log.debug("SysLogAspect： 类名： %s, 方法: %s",className,methodName);

        com.ouyaaa.common.upms.entity.SysLog sLog  = SysLogUtils.getSysLog();

        Long startTime = System.currentTimeMillis();
        Object obj = point.proceed();
        Long endTime = System.currentTimeMillis();
        sLog.setExcTime( endTime - startTime);
        //记录日志信息,可在这写入数据库
        log.info(sLog.toString());
        return obj;
    }
}
