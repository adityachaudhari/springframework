package com.ecommercearchitect.aop.example.noaop.services;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class TaxAPIsService {

    public void callExternalTaxAPIS() throws InterruptedException {
        Thread.sleep(TimeUnit.SECONDS.toMillis(6));
        System.out.println("calling tax APIs for given cart object");
    }
}
