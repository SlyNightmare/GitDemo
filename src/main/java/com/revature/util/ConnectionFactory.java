package com.revature.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionFactory {


	private ConnectionFactory() {}
		
	public static Connection getConnection() {
			try {Class.forName("oracle.jdbc.driver.OracleDriver");
				return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SSmith", "Jfullstack");
			} catch (SQLException e) {
				System.err.println("SQL State: " + e.getSQLState());
				System.err.println("Error Code: " + e.getErrorCode());
				throw new RuntimeException("Failed to get database connection");
			} catch (ClassNotFoundException e) {
				throw new RuntimeException("Failed to locate Database Driver");
			}
	}	
	 
}
