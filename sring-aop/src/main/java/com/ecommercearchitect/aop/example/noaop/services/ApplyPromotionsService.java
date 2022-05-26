package com.ecommercearchitect.aop.example.noaop.services;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class ApplyPromotionsService {

    public void applyPromotions() throws InterruptedException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(2));
        System.out.println("apply valid promotions if any");
    }

}
