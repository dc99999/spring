package com.os.model;

public class OrderModelInOrder {

	private String id;
	private String name;
	private String port;
	private String orderId;
	
	public OrderModelInOrder(String id, String name, String port, String orderId) {
		super();
		this.id = id;
		this.name = name;
		this.port = port;
		this.orderId = orderId;
	}
	
	public OrderModelInOrder() {
		super();
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
