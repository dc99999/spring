package com.ms.cp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.cp.config.Configuration;
import com.ms.cp.model.LimitModel;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class LimitController {
	
	private final Configuration config;

	@GetMapping("/getlimit")
	public LimitModel getLimit() {
		return LimitModel.builder().min(config.getMin()).max(config.getMax()).build();
	}
}
