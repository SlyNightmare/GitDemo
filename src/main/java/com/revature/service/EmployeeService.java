package com.revature.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.model.Employee;

public interface EmployeeService {

		List<Employee> getAllEmployees(HttpServletRequest request, HttpServletResponse response);
		
		Object createEmployee(HttpServletRequest request, HttpServletResponse response);

	}


