package com.os.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.os.model.OrderModelInOrder;

@RestController
public class OrderController {
	
	private static final String LOCAL_SERVER_PORT = "local.server.port";
	@Autowired
	private Environment env ;
	
	@GetMapping(path = "/getorder/{id}/{name}")
	public OrderModelInOrder getOrderMapping(@PathVariable String id, @PathVariable String name) {
		
		return new OrderModelInOrder(id, name, env.getProperty(LOCAL_SERVER_PORT),"ORDER_"+UUID.randomUUID().toString());
	}
	
}
