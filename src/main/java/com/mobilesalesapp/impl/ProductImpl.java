package com.mobilesalesapp.impl;

import java.sql.*;

import com.mobilesalesapp.connection.ConnectionPro;
import com.mobilesalesapp.dao.ProductDao;
import com.mobilesalesapp.model.ProductPojo;

public class ProductImpl implements ProductDao {
	public void add(ProductPojo obj) {
		try {

			Connection con = ConnectionPro.connect();

			String query = "insert into products (product_name,description,standard_price,list_price)"
					+ "values(?,?,?,?)";

			PreparedStatement pre = con.prepareStatement(query);
			pre.setString(1, obj.getProduct_name());
			pre.setString(2, obj.getDescription());
			pre.setDouble(3, obj.getStandard_cost());
			pre.setDouble(4, obj.getList_cost());
			int i = pre.executeUpdate();
			System.out.println(i + "row inserted");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void delete(ProductPojo obj1) {
		Connection con = ConnectionPro.connect();
		String query = "Delete from products where pk_product_id=?";
		try {
			PreparedStatement pre = con.prepareStatement(query);
			pre.setInt(1, obj1.getId());
			int i = pre.executeUpdate();
			System.out.println(i);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void update(ProductPojo obj1) {
		String query = "update products set standard_price=?,list_price=? where pk_product_id=?";
		Connection con = ConnectionPro.connect();
		try {
			PreparedStatement pre = con.prepareStatement(query);
			pre.setDouble(1, obj1.getStandard_cost());
			pre.setDouble(2, obj1.getList_cost());
			pre.setInt(3, obj1.getId());
			int i = pre.executeUpdate();
			System.out.println(i);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
