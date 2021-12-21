package com.pojo;

public class OrderPojo {
	private int userId;
	private int productId;
	private long price;
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
	
	
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
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
	
	public OrderPojo(int userId) {
		super();
		this.userId = userId;
	}
	public OrderPojo(int userId, int productId, long price, String address) {
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
