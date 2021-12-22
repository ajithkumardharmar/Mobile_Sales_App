package com.mobilesalesapp.dao;

import com.mobilesalesapp.model.ProductPojo;

public interface ProductDao {
	public void add(ProductPojo obj);
	public void delete(ProductPojo obj1);
	public void update(ProductPojo obj1);

}
