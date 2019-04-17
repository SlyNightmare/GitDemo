package com.revature.dao;

import java.util.List;

import com.revature.model.Employee;

public interface EmployeeDao {

	List<Employee> getAllEmployees();
	Employee getEmployeeById(int id);
	Employee createEmployee(Employee employee);
	Employee updateEmployee(Employee toBeUpdated);
	long deleteEmployee(Employee... toBeDeleted);
}
