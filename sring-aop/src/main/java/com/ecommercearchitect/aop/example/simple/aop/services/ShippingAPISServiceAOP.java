package com.ecommercearchitect.aop.example.simple.aop.services;

import com.ecommercearchitect.aop.example.simple.aop.annotations.PerformanceLoggerAOP;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class ShippingAPISServiceAOP {

    @PerformanceLoggerAOP
    public void callExternalShippingAPI() throws InterruptedException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(5));
        System.out.println("calling shipping APIs for given cart object");
    }
}
