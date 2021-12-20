package com.dao;

import com.connection.ConnectionPro;
import com.pojo.UpdateWalletPojo;
import java.sql.*;

public class OrderDao {
	public void updateWallet(UpdateWalletPojo obj1) {
		Connection con=ConnectionPro.connect();
		String query="update users_tables set wallet=(select wallet from users_table where pk_user_id=?)-?"
				+ "where password=?";
		ResultSet rs=null;
		try {
			PreparedStatement pre=con.prepareStatement(query);
			pre.setInt(1, obj1.getUserId());
			pre.setDouble(2,obj1.getPrice() );
			pre.setString(3, obj1.getPassword());
			 rs=pre.executeQuery(query);
			 
		//	System.out.println(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}
}
