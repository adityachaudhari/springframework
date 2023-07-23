package com.adityatechinsights.springboot.examples.aop.aopspringbootexample.configurations.aspects;

import com.adityatechinsights.springboot.examples.aop.aopspringbootexample.entities.Order;
import com.adityatechinsights.springboot.examples.aop.aopspringbootexample.entities.Product;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @AfterReturning(pointcut = "execution(* com.adityatechinsights.springboot.examples.aop.aopspringbootexample.services.ProductService.getProduct(..))",
            returning = "product")
    public void afterProductView(JoinPoint joinPoint, Product product) {
        logger.info("Product viewed: " + product.getName());
        //CompletableFuture.runAsync(() -> logger.info("Product viewed: " + product.getName()));
    }

    @AfterReturning(pointcut = "execution(* com.adityatechinsights.springboot.examples.aop.aopspringbootexample.services.OrderService.placeOrder(..))",
            returning = "order")
    public void afterOrderPlaced(JoinPoint joinPoint, Order order) {
        logger.info("Order placed: " + order.getId());
        //CompletableFuture.runAsync(() -> logger.info("Order placed: " + order.getId()));
    }
}
