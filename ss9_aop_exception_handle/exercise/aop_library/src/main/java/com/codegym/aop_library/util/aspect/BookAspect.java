package com.codegym.aop_library.util.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect("execution(* com.codegym.aop_library.controller.BookController.update(..)")
@Component
public class BookAspect {
    public void logAfterMethodController(JoinPoint joinPoint){
        String method = joinPoint.getSignature().getName();
        System.err.println("Phương thức vừa được gọi là: " + method);
    }
}
