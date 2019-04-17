package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.model.Employee;
import com.revature.util.ConnectionFactory;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		//Get our connection
		try (Connection conn = ConnectionFactory.getConnection()){
			//Create our statement to communicate with the database
			Statement stmt = conn.createStatement();
			
			//Execute the statement, all matched records can be found in the ResultSet
			ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
			
			//Populate our list of employees from the ResultSet
			while (rs.next()) {
				employees.add(new Employee(rs.getInt("id"), rs.getString("fname"), rs.getString("lname"), rs.getInt("social"), rs.getInt("phone"), rs.getString("address"), rs.getString("username"), rs.getString("password")));
			}
			
			//Return our Employees so that the application can further manipulate
			return employees;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee createEmployee(Employee employee) {
		//Get a connection to our Data Source
		try (Connection conn = ConnectionFactory.getConnection()){
			//Initialize our Insert statement
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO employees (id, fname, lname, social, phone, address, username, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
			
			//Set the values of our Insert Statement to help prevent SQL Injection
			stmt.setInt(1, employee.getId());
			stmt.setString(2, employee.getFname());
			stmt.setString(3, employee.getLname());
			stmt.setInt(4, employee.getSocial());
			stmt.setInt(5, employee.getPhone());
			stmt.setString(6, employee.getAddress());
			stmt.setString(7, employee.getUsername());
			stmt.setString(8, employee.getPassword());
			
			//Execute the query, determining the number of rows that were affected
			int rowsAffected = stmt.executeUpdate();
			if (rowsAffected == 1)
				return employee;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new Employee();
	}

	@Override
	public Employee updateEmployee(Employee toBeUpdated) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long deleteEmployee(Employee... toBeDeleted) {
		// TODO Auto-generated method stub
		return 0;
	}

}
