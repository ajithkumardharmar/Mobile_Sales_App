package com.products;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

public class ProductConnect {
	public void add(AddProductDao obj)  {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			
			String query="insert into products (product_name,description,standard_price,list_price)"
					+ "values(?,?,?,?)";
			
			
			PreparedStatement pre=con.prepareStatement(query);
			pre.setString(1,obj.getProduct_name());
			pre.setString(2, obj.getDescription());
			pre.setDouble(3, obj.getStandard_cost());
			pre.setDouble(4, obj.getList_cost());
			int i=pre.executeUpdate();
			System.out.println(i+"row inserted");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		//pre.setLong(3, obj.getStandard_cost());
		
		
		
		
	}

}
