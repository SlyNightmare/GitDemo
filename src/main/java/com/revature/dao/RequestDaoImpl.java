package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.model.Request;
import com.revature.util.ConnectionFactory;

public class RequestDaoImpl implements RequestDao {

	@Override
	public List<Request> getAllRequests() {
		List<Request> requests = new ArrayList<>();
		//Get our connection
		try (Connection conn = ConnectionFactory.getConnection()){
			//Create our statement to communicate with the database
			Statement stmt = conn.createStatement();
			
			//Execute the statement, all matched records can be found in the ResultSet
			ResultSet rs = stmt.executeQuery("SELECT * FROM requests");
			
			//Populate our list of requests from the ResultSet
			while (rs.next()) {
				requests.add(new Request(rs.getInt("id"), rs.getString("date"), rs.getInt("amount"), rs.getString("note"), rs.getString("approval")));
			}
			
			//Return our Requests so that the application can further manipulate
			return requests;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Request getRequestById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Request createRequest(Request request) {
		//Get a connection to our Data Source
		try (Connection conn = ConnectionFactory.getConnection()){
			//Initialize our Insert statement
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO requests (id, date, amount, note, approval) VALUES (?, ?, ?, ?, ?)");
			
			//Set the values of our Insert Statement to help prevent SQL Injection
			stmt.setInt(1, request.getId());
			stmt.setString(2, request.getDate());
			stmt.setInt(3, request.getAmount());
			stmt.setString(4, request.getNote());
			stmt.setString(5, request.getApproval());
			
			//Execute the query, determining the number of rows that were affected
			int rowsAffected = stmt.executeUpdate();
			if (rowsAffected == 1)
				return request;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new Request();
	}

	@Override
	public Request updateRequest(Request toBeUpdated) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long deleteRequest(Request... toBeDeleted) {
		// TODO Auto-generated method stub
		return 0;
	}

}
