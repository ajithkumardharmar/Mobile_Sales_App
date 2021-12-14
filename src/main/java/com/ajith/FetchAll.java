package com.ajith;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class FetchAll {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		
			Statement st=con.createStatement();
			ResultSet ns=st.executeQuery("select *from student3");
			
			while(ns.next()) {
				System.out.format("%-5s%-15s%-25s",ns.getInt(2),ns.getString(1)
						,ns.getString(3));
				System.out.println();
			}
		

	}

}
