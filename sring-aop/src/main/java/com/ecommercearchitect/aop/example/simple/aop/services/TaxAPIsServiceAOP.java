package com.ecommercearchitect.aop.example.simple.aop.services;

import com.ecommercearchitect.aop.example.simple.aop.annotations.PerformanceLoggerAOP;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class TaxAPIsServiceAOP {

    @PerformanceLoggerAOP
    public void callExternalTaxAPIS() throws InterruptedException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(6));
        System.out.println("calling tax APIs for given cart object");
    }
}
