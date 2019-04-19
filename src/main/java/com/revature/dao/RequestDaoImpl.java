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
		try (Connection conn = ConnectionFactory.getConnection()){
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM requests");
			
			while (rs.next()) {
				requests.add(new Request(rs.getInt("id"), rs.getInt("employeeid"), rs.getInt("amount"), rs.getString("note"), rs.getString("status"), rs.getString("manager")));
			}
			
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
		try (Connection conn = ConnectionFactory.getConnection()){
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO requests (id, employeeid, amount, note, status, manager) VALUES (?, ?, ?, ?, ?, ?)");
			
			stmt.setInt(1, request.getId());
			stmt.setInt(2, request.getEmployeeid());
			stmt.setInt(3, request.getAmount());
			stmt.setString(4, request.getNote());
			stmt.setString(5, request.getStatus());
			stmt.setString(6, request.getManager());

			
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
