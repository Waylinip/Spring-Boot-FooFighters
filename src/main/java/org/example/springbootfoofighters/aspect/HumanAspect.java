package org.example.springbootfoofighters.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
//public class HumanAspect {
//
//    private final Logger log = LoggerFactory.getLogger(HumanAspect.class);
//    private static Integer counter = 0;
//
//    @Pointcut("within(org.example.springbootfoofighters.service.*)")
//    public void allMethodPointcut() {}// перед всеми методами из service
//
//    @Pointcut("execution(public * org.example.springbootfoofighters.service.HumanService.getHumans(..))")
//    public void getHUMANSPointcut() {}// перед определенным
//
////    @Before("allMethodPointcut()")
////    public void loggingAdvice() {
////     log.info("Human logging advice");
////    }
//
//    @After("getHUMANSPointcut()")
//    public void loggingAdviceAfter(JoinPoint joinPoint) {
//        System.out.println("мф вызываем этот метод " + joinPoint.getSignature().getName());
//counter++;
//       log.info("Human logging advice after " + counter);
//    }
//
//
//}
