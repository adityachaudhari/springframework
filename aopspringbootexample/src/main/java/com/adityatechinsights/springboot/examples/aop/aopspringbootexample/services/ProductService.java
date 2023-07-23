package com.adityatechinsights.springboot.examples.aop.aopspringbootexample.services;

import com.adityatechinsights.springboot.examples.aop.aopspringbootexample.entities.Product;
import com.adityatechinsights.springboot.examples.aop.aopspringbootexample.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product getProduct(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
