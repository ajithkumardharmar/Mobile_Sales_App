package com.ajith;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NewConnection {
	public static void Connect1(RegisterDao p) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		
		String query="insert into users_table (first_name,email,phone_number,password,confirm_password) values(?,?,?,?,?)";
		String query2="commit";
		PreparedStatement pre=con.prepareStatement(query);
		pre.setString(1, p.getName());
		pre.setString(2, p.getEmail());
		pre.setLong(3, p.getPhone_number());
		pre.setString(4, p.getPassword());
		pre.setString(5, p.getConfirm_password());
		System.out.println("print");
		pre.executeUpdate();
		pre.executeUpdate(query2);
		System.out.println("print1");
		//System.out.println(i);
	}
	public static boolean fetch(LoginDao Login) throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		String query="select * from users_table  where email in ? and password in ?";
		PreparedStatement pre=con.prepareStatement(query);
		pre.setString(1, Login.getUsername());
		pre.setString(2, Login.getPassword());
	ResultSet rs = pre.executeQuery();

	if(rs.next()) {
		return true;
	}
	else
	{
		return false;	
	}
	
	}
	
}
