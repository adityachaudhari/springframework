package com.ecommercearchitect.aop.example.simple.aop;

import com.ecommercearchitect.aop.example.simple.aop.services.AddToCartServiceWithAOP;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleAOPSimpleExampleMain {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");

        AddToCartServiceWithAOP addToCartServiceWithAOP = applicationContext.getBean(AddToCartServiceWithAOP.class);

        addToCartServiceWithAOP.addToCart();


    }
}
