package com.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author haya
 */
@Configuration
//开启AspectJ 自动代理模式,如果不填proxyTargetClass=true，默认为false，
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages = "com")
@Component
@Aspect
public class AopConfig {
    private final String POINT_CUT = "execution( * com.service.impl.*.*(..))";

    @Pointcut(POINT_CUT)
    public void pointCut() {
    }

    @Before(value = "pointCut()")
    public void before(JoinPoint joinPoint) {
        System.out.println( "before" );
    }

    @After(value = "pointCut()")
    public void after(JoinPoint joinPoint) {
        System.out.println( "after" );
    }

    @Around(value = "pointCut()")
    public boolean around(ProceedingJoinPoint proceedingJoinPoint) {
        boolean flag = false;
        System.out.println( "before" );
        try {
            flag = (boolean) proceedingJoinPoint.proceed();
            System.out.println( flag );
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("回滚");
        }

        System.out.println( "after" );
        return flag;
    }
}
