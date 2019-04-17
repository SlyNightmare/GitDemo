package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.model.Manager;
import com.revature.util.ConnectionFactory;

public class ManagerDaoImpl implements ManagerDao{

	@Override
	public List<Manager> getAllManagers() {
		List<Manager> managers = new ArrayList<>();
		//Get our connection
		try (Connection conn = ConnectionFactory.getConnection()){
			//Create our statement to communicate with the database
			Statement stmt = conn.createStatement();
			
			//Execute the statement, all matched records can be found in the ResultSet
			ResultSet rs = stmt.executeQuery("SELECT * FROM managers");
			
			//Populate our list of managers from the ResultSet
			while (rs.next()) {
				managers.add(new Manager(rs.getInt("id"), rs.getString("fname"), rs.getString("lname"), rs.getInt("social"), rs.getInt("phone"), rs.getString("address"), rs.getString("username"), rs.getString("password")));
			}
			
			//Return our Managers so that the application can further manipulate
			return managers;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Manager getManagerById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Manager createManager(Manager manager) {
		//Get a connection to our Data Source
		try (Connection conn = ConnectionFactory.getConnection()){
			//Initialize our Insert statement
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO managers (id, fname, lname, social, phone, address, username, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
			
			//Set the values of our Insert Statement to help prevent SQL Injection
			stmt.setInt(1, manager.getId());
			stmt.setString(2, manager.getFname());
			stmt.setString(3, manager.getLname());
			stmt.setInt(4, manager.getSocial());
			stmt.setInt(5, manager.getPhone());
			stmt.setString(6, manager.getAddress());
			stmt.setString(7, manager.getUsername());
			stmt.setString(8, manager.getPassword());
			
			//Execute the query, determining the number of rows that were affected
			int rowsAffected = stmt.executeUpdate();
			if (rowsAffected == 1)
				return manager;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new Manager();
	}

	@Override
	public Manager updateManager(Manager toBeUpdated) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long deleteManager(Manager... toBeDeleted) {
		// TODO Auto-generated method stub
		return 0;
	}

}
