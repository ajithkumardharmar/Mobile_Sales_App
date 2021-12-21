package com.dao;

import com.connection.ConnectionPro;
import com.pojo.OrderPojo;
import com.pojo.UpdateWalletPojo;
import java.sql.*;

public class OrderDao {
//	public int updateWallet(UpdateWalletPojo obj1) {
//		Connection con=ConnectionPro.connect();
//		
//		System.out.println("or0"+obj1.getUserId()+obj1.getPassword()+obj1.getPrice());
////		String query="update users_table set wallet = (select wallet from users_table where pk_user_id=?)-?"
////				+ "where password=?";
//		String sQuery="select wallet from users_table where pk_user_id=?";
//		String query="update users_table set wallet =? where password=?";
//		String query4="commit";
//		System.out.println("or1");
//		int i=0;
//		
//		//ResultSet rs=null;
//		try {
//			PreparedStatement pre=con.prepareStatement(query);
//			PreparedStatement pre1=con.prepareStatement(sQuery);
//			pre1.setInt(1, obj1.getUserId());
//			ResultSet rs=pre1.executeQuery();
//			int wallet=0;
//			if(rs.next())
//			{
//			wallet=rs.getInt(1);	
//			}
//			System.out.println(wallet-obj1.getPrice());
//			int price=(int)(wallet-obj1.getPrice());
//			pre.setInt(1, price);
//			
//			pre.setString(2, obj1.getPassword());
//			System.out.println("or01");
//			 
//			 System.out.println("out"+pre.executeUpdate());
//			 System.out.println("or001");
//			 
//		//	System.out.println(i);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("or2");
//		return i;
//	
//		
//	}

	public int inserOrder(OrderPojo obj2) {
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
}