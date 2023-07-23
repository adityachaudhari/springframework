/*
package com.adityatechinsights.springboot.examples.aop.aopspringbootexample;

import com.adityatechinsights.springboot.examples.aop.aopspringbootexample.configurations.aspects.LoggingAspect;
import com.adityatechinsights.springboot.examples.aop.aopspringbootexample.entities.Order;
import com.adityatechinsights.springboot.examples.aop.aopspringbootexample.entities.Product;
import com.adityatechinsights.springboot.examples.aop.aopspringbootexample.services.OrderService;
import com.adityatechinsights.springboot.examples.aop.aopspringbootexample.services.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;

@SpringBootTest
@ExtendWith(SpringExtension.class) // Enable Spring support for JUnit 5
@ExtendWith(MockitoExtension.class)
class AopspringbootexampleApplicationTests {


	@Autowired
	private ProductService productService;

	@Autowired
	private OrderService orderService;

	@MockBean
	private Logger logger; // Mock the Logger to capture log statements



	@Test
	public void testAfterProductView() {
		// Create a mock Product
		Product product = new Product();
		product.setName("Test Product");
		product.setId(1L);

		// Set up the ProductService mock to return the mock Product
		Mockito.when(productService.getProduct(ArgumentMatchers.anyLong())).thenReturn(product);

		// Call the ProductService method to trigger the aspect
		Product fetchedProduct = productService.getProduct(1L);


		// Verify that the logger logged the expected message
		Mockito.verify(logger).info("Product viewed: " + fetchedProduct.getName());
	}

	@Test
	public void testAfterOrderPlaced() {
		// Create a mock Order
		Order order = new Order();
		order.setId(1L);

		// Set up the OrderService mock to return the mock Order
		Mockito.when(orderService.placeOrder(ArgumentMatchers.anyLong())).thenReturn(order);

		// Call the OrderService method to trigger the aspect
		Order placedOrder = orderService.placeOrder(1L);

		// Verify that the logger logged the expected message
		Mockito.verify(logger).info("Order placed: " + placedOrder.getId());
	}

}
*/
