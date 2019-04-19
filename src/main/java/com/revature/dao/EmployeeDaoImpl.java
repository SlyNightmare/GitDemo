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
		
		try (Connection conn = ConnectionFactory.getConnection()){
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
			
			while (rs.next()) {
				employees.add(new Employee(rs.getInt("id"), rs.getString("fname"), rs.getString("lname"), rs.getString("username"), rs.getString("password"), rs.getString("position")));
			}
			
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
		try (Connection conn = ConnectionFactory.getConnection()){
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO employees (id, fname, lname, username, password, position) VALUES (?, ?, ?, ?, ?, ?)");
			
			stmt.setInt(1, employee.getId());
			stmt.setString(2, employee.getFname());
			stmt.setString(3, employee.getLname());
			stmt.setString(4, employee.getUsername());
			stmt.setString(5, employee.getPassword());
			stmt.setString(6, employee.getPosition());

			
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
