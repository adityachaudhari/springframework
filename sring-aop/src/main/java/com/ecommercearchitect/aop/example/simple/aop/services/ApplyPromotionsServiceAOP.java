package com.ecommercearchitect.aop.example.simple.aop.services;

import com.ecommercearchitect.aop.example.simple.aop.annotations.PerformanceLoggerAOP;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class ApplyPromotionsServiceAOP {

    @PerformanceLoggerAOP
    public void applyPromotions() throws InterruptedException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(2));
        System.out.println("apply valid promotions if any");
    }

}
