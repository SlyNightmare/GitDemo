package com.revature.web;

import java.util.Collections;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.service.EmployeeService;
import com.revature.service.EmployeeServiceImpl;

public class Dispatcher {

	private static final EmployeeService employeeService = new EmployeeServiceImpl();
	
	private Dispatcher() {}
	
	public static Object process(HttpServletRequest request, HttpServletResponse response) {
		final String uri = request.getRequestURI().replace("/ServletExample/api", "");
		System.out.println("Inside Dispatcher: " + request.getMethod() + " request going to " + uri);
		switch(uri) {
		case "/employees":
			return employeeService.getAllEmployees(request,response);
		default:	
			return Collections.singletonMap("message", "Not yet implemented");
		}
		
	}
	public static Object processPost(HttpServletRequest request, HttpServletResponse response) {
		final String uri = request.getRequestURI().replace("/ServletExample/api", "");
		System.out.println("Inside Dispatcher: " + request.getMethod() + " request going to " + uri);
		switch(uri) {
		case "/employees":
			return employeeService.createEmployee(request, response);
		default:
			return Collections.singletonMap("message", "Not yet implemented");
		}
	}
}
