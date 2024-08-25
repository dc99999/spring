package com.ms.demo.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ms.demo.model.CustomerBean;
import com.ms.demo.repos.UserRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class CustomerDaoService {

	
	private final UserRepository repository;
	
	public CustomerBean createUser(CustomerBean user) {
		return user;
	}
	
	
	public List<CustomerBean> getAllData() {
		return repository.findAll();
	}
	
	public CustomerBean getAllData(String id) {
		return repository.findById(id).orElse(null);
	}
	
	
}
