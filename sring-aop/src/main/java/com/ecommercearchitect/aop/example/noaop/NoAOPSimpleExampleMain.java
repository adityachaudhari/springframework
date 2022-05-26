package com.ecommercearchitect.aop.example.noaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NoAOPSimpleExampleMain {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");

        AddToCartService addToCartService = applicationContext.getBean(AddToCartService.class);

        addToCartService.addToCart();


    }
}
