package com.dao;

import java.sql.*;

import com.connection.ConnectionPro;
import com.pojo.AdminPojo;

import jakarta.servlet.http.HttpServlet;

public class AdminDao extends HttpServlet {
	public static boolean login(AdminPojo admin) throws ClassNotFoundException, SQLException {
		
		Connection con =ConnectionPro.connect();
		String query="select *from admins_table where email in ? and password in ?";
		PreparedStatement pre=con.prepareStatement(query);
		pre.setString(1, admin.getAdminUserName());
		pre.setString(2, admin.getPassword());
		//System.out.println(AdminUserName+password);
		
		int i=pre.executeUpdate();
		System.out.println(i);
		if(i>0) {
			return true;
		}
		else {
			return false;
		}
		
		
		
	}

}
