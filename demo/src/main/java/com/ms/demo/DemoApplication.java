package com.ms.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
public class DemoApplication {

	
	@RequestMapping(method = RequestMethod.GET, path = "/consumer")
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
