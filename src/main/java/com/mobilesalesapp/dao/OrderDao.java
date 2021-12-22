package com.mobilesalesapp.dao;

import com.mobilesalesapp.model.OrderPojo;
import com.mobilesalesapp.model.UpdateWalletPojo;

public interface OrderDao {
	public int updateWallet1(UpdateWalletPojo obj1);
	public int insertOrder(OrderPojo obj2);
	

}
