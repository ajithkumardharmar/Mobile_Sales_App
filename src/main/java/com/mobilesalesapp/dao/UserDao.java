package com.mobilesalesapp.dao;

import java.sql.ResultSet;


import com.mobilesalesapp.model.RegisterPojo;

public interface UserDao {
	public  void register(RegisterPojo p) ;
	public  ResultSet fetch(RegisterPojo Login);
	public  ResultSet userDetails();

}
