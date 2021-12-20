package com.pojo;

public class RegisterPojo {
	
	
	private String name;
	private String email;
	private Long phone_number;
	private String password;
	
	private String confirm_password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(Long phone_number) {
		this.phone_number = phone_number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm_password() {
		return confirm_password;
	}
	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
	@Override
	public String toString() {
		return "RegisterDao [name=" + name + ", email=" + email + ", phone_number=" + phone_number + ", password="
				+ password + ", confirm_password=" + confirm_password + "]";
	}
	public RegisterPojo(String name, String email, Long phone_number, String password, String confirm_password) {
		super();
		this.name = name;
		this.email = email;
		this.phone_number = phone_number;
		this.password = password;
		this.confirm_password = confirm_password;
	}
	public RegisterPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
