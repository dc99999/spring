package com.ms.cloud.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ms.cloud.model.OrderModel;

@FeignClient(name="ORDER-SERVICE")
public interface OrderServiceFeignClient {

	@GetMapping("/getorder/{id}/{name}")
	public OrderModel getOrder(@PathVariable String id, @PathVariable String name);
}
