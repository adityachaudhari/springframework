package com.adityatechinsights.springboot.examples.aop.aopspringbootexample.services;

import com.adityatechinsights.springboot.examples.aop.aopspringbootexample.entities.Order;
import com.adityatechinsights.springboot.examples.aop.aopspringbootexample.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order placeOrder(Long productId) {
        Order order = new Order();
        order.setProductId(productId);
        return orderRepository.save(order);
    }
}
