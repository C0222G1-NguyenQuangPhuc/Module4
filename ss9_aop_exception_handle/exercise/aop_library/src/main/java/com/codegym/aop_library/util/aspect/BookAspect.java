package com.codegym.aop_library.util.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BookAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @After("execution(* com.codegym.aop_library.controller.BookController.*(..))")
    public void logAfterMethodController(JoinPoint joinPoint) {
        String method = joinPoint.getSignature().getName();
        System.err.println("Phương thức vừa được gọi là: " + method);
    }
}
