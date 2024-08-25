package com.ms.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.demo.model.CustomerBean;

public interface UserRepository extends JpaRepository<CustomerBean, String> {

}
