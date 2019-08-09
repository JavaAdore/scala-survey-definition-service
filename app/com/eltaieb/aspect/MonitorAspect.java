package com.eltaieb.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;

@Aspect
public class MonitorAspect {

    @Around( value = "execution (* controllers.HomeController(..))")
    public Object receiveMessagePointcut(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("before");
        try {
            Object result =  pjp.proceed();
            System.out.println("after");
            return result;
        }catch(Exception ex)
        {
            System.out.println("exception");
            throw ex;
        }
    }


}