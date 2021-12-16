package com.admin;

public class AdminDao {
	private String AdminUserName;
	private String password;
	public String getAdminUserName() {
		return AdminUserName;
	}
	public void setAdminUserName(String adminUserName) {
		AdminUserName = adminUserName;
	}
	public String getPassword() {
		return password;
	}
	public AdminDao(String adminUserName, String password) {
		super();
		AdminUserName = adminUserName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "AdminDao [AdminUserName=" + AdminUserName + ", password=" + password + "]";
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
