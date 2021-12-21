package com.pojo;

public class UpdateWalletPojo {
	private int userId;
	private String password;
	private long price;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	
	public UpdateWalletPojo(int userId, String password, long price) {
		super();
		this.userId = userId;
		this.password = password;
		this.price = price;
	}
	@Override
	public String toString() {
		return "UpdateWalletPojo [userId=" + userId + ", password=" + password + ", price=" + price + "]";
	}
	public UpdateWalletPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
