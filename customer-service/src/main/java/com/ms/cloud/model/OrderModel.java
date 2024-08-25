package com.ms.cloud.model;

public class OrderModel {

	private String id;
	private String name;
	private String port;
	private String orderId;
	
	public OrderModel(String id, String name, String port, String orderId) {
		super();
		this.id = id;
		this.name = name;
		this.port = port;
		this.orderId = orderId;
	}
	
	public OrderModel() {
		super();
		// TODO Auto-generated constructor stub
	}




	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
