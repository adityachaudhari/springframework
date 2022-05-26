package com.ecommercearchitect.aop.example.noaop.services;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class ShippingAPISService {

    public void callExternalShippingAPI() throws InterruptedException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(5));
        System.out.println("calling shipping APIs for given cart object");
    }
}
