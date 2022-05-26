package com.ecommercearchitect.aop.example.noaop.services;

import com.ecommercearchitect.aop.example.simple.aop.annotations.PerformanceLoggerAOP;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class AddProductToCartService {

    public void addProductToCart() throws InterruptedException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(3));
        System.out.println("Adding product to cart , if cart object is not created create it and add product");
    }
}
