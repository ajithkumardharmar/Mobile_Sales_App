package com.mobilesalesapp.model;

public class OrderPojo {
	private int userId;
	private int productId;
	private double price;
	private String address;
	private int orerId;
	
	

	

	public OrderPojo(int productId, int orerId) {
		super();
		this.productId = productId;
		this.orerId = orerId;
	}

	public OrderPojo(int userId) {
		super();
		this.userId = userId;
	}
	
	public int getOrerId() {
		return orerId;
	}
	public void setOrerId(int orerId) {
		this.orerId = orerId;
	}
	

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	
	
	public OrderPojo(int userId, int productId, double price, String address) {
		super();
		this.userId = userId;
		this.productId = productId;
		this.price = price;
		this.address = address;
	}
	@Override
	public String toString() {
		return "OrderPojo [userId=" + userId + ", productId=" + productId + ", price=" + price + ", address=" + address
				+ "]";
	}
	

	public OrderPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
