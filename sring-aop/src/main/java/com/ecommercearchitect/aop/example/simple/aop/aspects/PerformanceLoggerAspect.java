package com.ecommercearchitect.aop.example.simple.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;

import java.time.Duration;
import java.util.logging.Logger;

public class PerformanceLoggerAspect {

    private Logger logger = Logger.getLogger("performance.logger.aop");

    public Object logPerformance(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        //System.out.println("inside AOPPppppp");
        long startTime = System.currentTimeMillis();
        try {
            return proceedingJoinPoint.proceed();
        } finally {
            long finishTime = System.currentTimeMillis();
            Duration duration = Duration.ofMillis(finishTime - startTime);
            logger.info(String.format("Duration of %s execution was %s", proceedingJoinPoint.getSignature(), duration));
        }
    }
}
