package com.mobilesalesapp.dao;

import com.mobilesalesapp.model.AdminPojo;
import com.mobilesalesapp.model.RegisterPojo;

public interface AdminDao {
	public boolean login(AdminPojo admin);

	public int addWalletAmount(RegisterPojo wallet);

}
