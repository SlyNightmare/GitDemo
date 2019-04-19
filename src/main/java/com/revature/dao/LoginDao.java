package com.revature.dao;

import java.util.List;

import com.revature.model.Login;

public interface LoginDao {

	public Login getLoginByUser(String user);
	public List<Login> getLogins();
}
