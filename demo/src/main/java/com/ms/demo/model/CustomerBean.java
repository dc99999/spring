package com.ms.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity(name = "user_details")
@AllArgsConstructor
@NoArgsConstructor
public class CustomerBean {
	
	@Id
	@GeneratedValue
	private String name;
	
	private String customerId;
	
}
