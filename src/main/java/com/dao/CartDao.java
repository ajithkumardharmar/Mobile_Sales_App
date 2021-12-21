package com.dao;

import com.connection.ConnectionPro;
import com.pojo.CartPojo;
import java.sql.*;

public class CartDao {
	public void addCart(CartPojo cartPojo) {
		Connection con = ConnectionPro.connect();
		String query = "select * from products where pk_product_id=?";
		String query2 = "insert into carts_table(user_id,product_id,product_name,descrption,price)"
				+ " values (?,?,?,?,?)";
		String productName=null;
		String description=null;
		ResultSet rs2=null;
		double price=0;
		
		try {
			PreparedStatement pre = con.prepareStatement(query);
			pre.setInt(1, cartPojo.getProductId());
			ResultSet rs = pre.executeQuery();
			if (rs.next()) {
				 productName = rs.getString(2);
				 description = rs.getString(3);
				 price = rs.getDouble(5);
			}
			PreparedStatement pre2 = con.prepareStatement(query2);
			pre2.setInt(1, cartPojo.getUserId());
			pre2.setInt(2, cartPojo.getProductId());
			pre2.setString(3, productName);
			pre2.setString(4, description);
			pre2.setDouble(5, price);
			rs2=pre2.executeQuery();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}

	}
}
