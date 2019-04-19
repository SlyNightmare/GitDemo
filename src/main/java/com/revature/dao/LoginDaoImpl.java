package com.revature.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.model.Login;
import com.revature.util.ConnectionFactory;

public class LoginDaoImpl implements LoginDao {

	@Override
	public Login getLoginByUser(String user) {
		Login log = new Login();
		String sql = "SELECT * FROM EMPLOYEES WHERE USERNAME = ?";
		ResultSet rs = null;
		
		try(Connection conn = ConnectionFactory.getConnection();
				
				PreparedStatement prep = conn.prepareStatement(sql)){
					prep.setString(1, user);
					rs = prep.executeQuery();
					
					while(rs.next()) {
						int empId = rs.getInt("EMP_ID");
						log.setId(empId);
						
						String username = rs.getString("EMP_USERNAME");
						log.setUser(username);
						
						String password = rs.getString("EMP_PASSWORD");
						log.setPassword(password);
					
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					if(rs != null) {
						try {
							rs.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}
					return log;
	}
	

	@Override
	public List<Login> getLogins() {
		List<Login> loginList = new ArrayList<Login>();
		
		String sql = "SELECT * FROM EMPLOYEES";
		
		try(Connection conn = ConnectionFactory.getConnection();
				Statement state = conn.createStatement();
				ResultSet rs = state.executeQuery(sql)){
			while(rs.next()) {
				Login log = new Login();
				int empId = rs.getInt("EMP_ID");
				log.setId(empId);
				
				String user = rs.getString("EMP_USERNAME");
				log.setUser(user);
				
				String password = rs.getString("EMP_PASSWORD");
				log.setPassword(password);
				
				loginList.add(log);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return loginList;
	}

	
}
