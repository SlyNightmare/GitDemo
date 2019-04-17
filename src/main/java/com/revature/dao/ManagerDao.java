package com.revature.dao;

import java.util.List;

import com.revature.model.Manager;

public interface ManagerDao {

	List<Manager> getAllManagers();
	Manager getManagerById(int id);
	Manager createManager(Manager manager);
	Manager updateManager(Manager toBeUpdated);
	long deleteManager(Manager... toBeDeleted);
}
