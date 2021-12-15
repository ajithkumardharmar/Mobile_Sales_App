package com.admin;

import java.sql.*;
import jakarta.servlet.http.HttpServlet;

public class ServletConnection extends HttpServlet {
	public static boolean login(AdminDao admin) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
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
