package com.mobilesalesapp.dao;

import java.sql.*;

import com.mobilesalesapp.connection.ConnectionPro;
import com.mobilesalesapp.impl.ListAllProductImpl;

public class ListAllProductDao implements ListAllProductImpl {
	public  ResultSet viewProduct() {
		
		Connection con=ConnectionPro.connect();
		String query="select pk_product_id,product_name,description,standard_price,list_price from products";
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
