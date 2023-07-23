package com.adityatechinsights.springboot.examples.aop.aopspringbootexample.repositories;

import com.adityatechinsights.springboot.examples.aop.aopspringbootexample.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}

