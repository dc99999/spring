package com.ss.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleController {

	Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	@GetMapping("/test")
	public String getTested() {
		logger.info("Executed succesfully here ..!");
		return "Executed SuccesFully";
	}
}
