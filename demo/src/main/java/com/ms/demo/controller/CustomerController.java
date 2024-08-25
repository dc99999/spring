package com.ms.demo.controller;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ms.demo.dao.CustomerDaoService;
import com.ms.demo.model.CustomerBean;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/rest")
@AllArgsConstructor
public class CustomerController {

    private final CustomerDaoService service;
	
	@RequestMapping(method = RequestMethod.GET, path = "/consume")
	public String consume() {
		return "Hello";
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/consumejson")
	public CustomerBean consumeJson() {
		return CustomerBean.builder().name("Datta").customerId("999999").build();
	}
	
	
	@RequestMapping(method = RequestMethod.GET, path = "/getall")
	public List <CustomerBean>  getALl() {
		return service.getAllData();
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/get")
	public CustomerBean  getOne(@RequestParam String id) {
		return service.getAllData(id);
	}
	
	@PostMapping(path = "/create")
	public CustomerBean createteCustomer(@RequestBody CustomerBean user) {
		return user;
	}

}