package com.adityatechinsights.springboot.examples.aop.aopspringbootexample.repositories;

import com.adityatechinsights.springboot.examples.aop.aopspringbootexample.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}
