package com.adityatechinsights.springboot.examples.aop.aopspringbootexample;

import com.adityatechinsights.springboot.examples.aop.aopspringbootexample.entities.Order;
import com.adityatechinsights.springboot.examples.aop.aopspringbootexample.entities.Product;
import com.adityatechinsights.springboot.examples.aop.aopspringbootexample.services.OrderService;
import com.adityatechinsights.springboot.examples.aop.aopspringbootexample.services.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopspringbootexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopspringbootexampleApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ProductService productService, OrderService orderService) {
		return (args) -> {
			// Create a product
			Product product = new Product();
			product.setName("Test Product");

			productService.saveProduct(product);

			// Fetch the product
			Product fetchedProduct = productService.getProduct(product.getId());

			// Place an order
			Order order = orderService.placeOrder(fetchedProduct.getId());
		};
	}

}
