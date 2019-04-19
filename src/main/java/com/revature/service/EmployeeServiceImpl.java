package com.revature.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.dao.EmployeeDao;
import com.revature.dao.EmployeeDaoImpl;
import com.revature.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeDao dao = new EmployeeDaoImpl();
	private final ObjectMapper mapper = new ObjectMapper();

	@Override
	public List<Employee> getAllEmployees(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Inside EmployeeServiceImpl");
		return dao.getAllEmployees();
	}

	@Override
	public Employee createEmployee(HttpServletRequest request, HttpServletResponse response) {
		try {

			Employee employee = mapper.readValue(request.getInputStream(), Employee.class);

			return dao.createEmployee(employee);
		} catch (IOException e) {
			// TODO: Refine exception handling logic
			return null;
		}
	}

}
