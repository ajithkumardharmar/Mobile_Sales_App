package com.mobilesalesapp.impl;

import com.mobilesalesapp.connection.ConnectionPro;
import com.mobilesalesapp.dao.OrderDao;
import com.mobilesalesapp.model.OrderPojo;
import com.mobilesalesapp.model.UpdateWalletPojo;

import java.sql.*;

public class OrderImpl implements OrderDao {

	public int updateWallet1(UpdateWalletPojo obj1) {
		int i = 0;
		Connection con = ConnectionPro.connect();
		String query1="commit";
		
		
		String query = "update users_table set wallet = (select wallet from users_table where pk_user_id=?)-? where pk_user_id=? and password=?";
		try {
			Statement st=con.createStatement();
			st.executeUpdate(query1);
			PreparedStatement pre = con.prepareStatement(query);
			pre.setInt(1, obj1.getUserId());
			pre.setLong(2, obj1.getPrice());
			pre.setInt(3, obj1.getUserId());
			pre.setString(4, obj1.getPassword());
			System.out.println("1");
			i = pre.executeUpdate();
			System.out.println("2");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}

	public int insertOrder(OrderPojo obj2) {
		Connection con = ConnectionPro.connect();
		String query2 = "insert into orders_table (fk_user_id,fk_product_id,price,address) values (?,?,?,?)";
		String query3 = "commit";
		int i = 0;
		// ResultSet rs2=null;
		try {
			PreparedStatement pre = con.prepareStatement(query2);
			pre.setInt(1, obj2.getUserId());
			pre.setInt(2, obj2.getProductId());
			pre.setLong(3, obj2.getPrice());
			pre.setString(4, obj2.getAddress());
			i = pre.executeUpdate();
			// pre.executeQuery(query2);

			// System.out.println(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;

	}


}