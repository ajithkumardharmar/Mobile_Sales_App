package com.pojo;

public class OrderPojo {
	private int userId;
	private int productId;
	private Double price;
	private String address;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "OrderPojo [userId=" + userId + ", productId=" + productId + ", price=" + price + ", address=" + address
				+ "]";
	}
	public OrderPojo(int userId, int productId, Double price, String address) {
		super();
		this.userId = userId;
		this.productId = productId;
		this.price = price;
		this.address = address;
	}
	public OrderPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
