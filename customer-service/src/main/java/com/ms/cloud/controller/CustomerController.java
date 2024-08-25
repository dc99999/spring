package com.ms.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ms.cloud.client.OrderServiceFeignClient;
import com.ms.cloud.model.Customer;
import com.ms.cloud.model.OrderModel;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@RestController

public class CustomerController {
	@Autowired
	OrderServiceFeignClient client;

	Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@GetMapping(path = "/getcustomer/{name}/{id}")
	public Customer getCustomer(@PathVariable String name, @PathVariable String id) {
		OrderModel model = client.getOrder(id, name);
		return new Customer(name, id, model.getPort(), model.getOrderId());
	}
	
	@GetMapping(path = "/testretry")
	@Retry(name = "ExceptionRetry", fallbackMethod = "staticResponse")
	public String getException() {
		logger.info(" Executed getException {}", System.currentTimeMillis());
		if (true) {
			throw new RuntimeException(" Exception to test Retry ");
		}
		return "Sample API";
	}
	
	public String staticResponse(Exception e) {
		return "Response From fallback Method";
	} 
	
	
	@GetMapping(path = "/testcb")
	@CircuitBreaker(name = "dafault", fallbackMethod = "staticResponse")
	public String testCB() {
		logger.info(" Executed testCB {}", System.currentTimeMillis());
		if (true) {
			throw new RuntimeException(" Exception to test Retry ");
		}
		return "Sample API";
	}
	
}

