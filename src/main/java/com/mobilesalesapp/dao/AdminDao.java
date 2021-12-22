package com.mobilesalesapp.dao;

import java.sql.*;

import com.mobilesalesapp.connection.ConnectionPro;
import com.mobilesalesapp.impl.AdminImpl;
import com.mobilesalesapp.model.AdminPojo;



public class AdminDao implements AdminImpl  {
	public  boolean login(AdminPojo admin)  {
		
		Connection con =ConnectionPro.connect();
		String query="select *from admins_table where email in ? and password in ?";
		PreparedStatement pre;
		int i=0;
		try {
			pre = con.prepareStatement(query);
			pre.setString(1, admin.getAdminUserName());
			pre.setString(2, admin.getPassword());
			//System.out.println(AdminUserName+password);
			
			 i=pre.executeUpdate();
			System.out.println(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(i>0) {
			return true;
		}
		else {
			return false;
		}
		
		
		
	}

}
