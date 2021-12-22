package com.mobilesalesapp.dao;

import java.sql.ResultSet;

import com.mobilesalesapp.model.LoginPojo;
import com.mobilesalesapp.model.RegisterPojo;

public interface UserDao {
	public  void Connect1(RegisterPojo p) ;
	public  ResultSet fetch(LoginPojo Login);
	public  ResultSet userDetails();

}
