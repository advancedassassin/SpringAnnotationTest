package com.ydx.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @ClassName LogAspects
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/10/2 14:01
 * @Version 1.0
 **/
@Aspect
public class LogAspects {

    @Pointcut("execution(public int com.ydx.aop.MathCalculator.*(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println("方法"+joinPoint.getSignature().getName()+"准备运行，参数列表是：{"+ Arrays.asList(args) +"}");
    }

    @After("com.ydx.aop.LogAspects.pointCut()")
    public void logEnd(JoinPoint joinPoint){
        System.out.println("方法"+joinPoint.getSignature().getName()+"运行结束");
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void logReturn(JoinPoint joinPoint, Object result){
        System.out.println("方法"+joinPoint.getSignature().getName()+"正常返回，运行结果是：{"+result+"}");
    }

    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logException(JoinPoint joinPoint,Exception exception){
        System.out.println("方法"+joinPoint.getSignature().getName()+"运行异常，异常信息：{"+exception+"}");
    }
}
