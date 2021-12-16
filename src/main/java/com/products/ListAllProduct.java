package com.products;

import com.ajith.ConnectionPro;

import java.sql.*;

public class ListAllProduct {
	public static ResultSet viewProduct() {
		
		Connection con=ConnectionPro.connect();
		String query="select product_name,description,standard_price,list_price from products";
		ResultSet ns=null;
		
		try {
			Statement st = con.createStatement();
			ns = st.executeQuery(query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return ns;
		
	}

}
