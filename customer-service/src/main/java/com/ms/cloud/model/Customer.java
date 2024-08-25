package com.ms.cloud.model;

public class Customer {

	private String name;

	private String id;

	private String port;

	private String orderId;
	
	

	public Customer(String name, String id, String port, String orderId) {
		super();
		this.name = name;
		this.id = id;
		this.port = port;
		this.orderId = orderId;
	}

	public Customer() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
}
