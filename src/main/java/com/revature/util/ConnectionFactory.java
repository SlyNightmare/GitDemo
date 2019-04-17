package com.revature.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionFactory {

	private static final Properties props = getJdbcProperties();
	public static final String EMPLOYEES_DDL = "CREATE TABLE employees(id IDENTITY PRIMARY KEY, fname VARCHAR(30), lname VARCHAR(30), social INT(9), phone INT(10), address VARCHAR(255), username VARCHAR(255), passwordVARCHAR(255))";
	public static final String INSERT_EMPLOYEE_QUERY = "INSERT INTO employees (id, fname, lname, social, phone, address, username, password) VALUES (?,?,?,?,?,?,?,?)";
	public static final String MANAGERS_DDL = "CREATE TABLE managers(id IDENTITY PRIMARY KEY, fname VARCHAR(30), lname VARCHAR(30), social INT(9), phone INT(10), address VARCHAR(255), username VARCHAR(255), passwordVARCHAR(255))";
	public static final String INSERT_MANAGER_QUERY = "INSERT INTO managers (id, fname, lname, social, phone, address, username, password) VALUES (?,?,?,?,?,?,?,?)";
	public static final String REQUESTS_DDL = "CREATE TABLE requests(id IDENTITY PRIMARY KEY, date VARCHAR(255), amount INT(30), note VARCHAR(255), approval VARCHAR(10))";
	public static final String INSERT_REQUEST_QUERY = "INSERT INTO requests (id, fname, lname, social, phone, address, username, password) VALUES (?,?,?,?,?)";
	
	
	//restricts instantiation, typically a good sign that you are creating
	//either a Factory or a Singleton
	private ConnectionFactory() {}
		
	public static Connection getConnection() {
			try {Class.forName("org.h2.Driver");
				return DriverManager.getConnection(props.getProperty("jdbc.url"),
											   props.getProperty("jdbc.username"),
											   props.getProperty("jdbc.password"));
			} catch (SQLException e) {
				System.err.println("SQL State: " + e.getSQLState());
				System.err.println("Error Code: " + e.getErrorCode());
				throw new RuntimeException("Failed to get database connection");
			} catch (ClassNotFoundException e) {
				throw new RuntimeException("Failed to locate Database Driver");
			}
	}	
	
	
	/*
	 * ONLY NEEDED FOR OUR EXAMPLE!!!
	 */
	public static void initializeDatabase() {
		//Create our todos table
		Connection conn = getConnection();
		try {
			Statement createEmployeeTable = conn.createStatement();
			if (!createEmployeeTable.execute(EMPLOYEES_DDL))
				System.out.println("Employees table created!");
		PreparedStatement insertEmployeeStatement = conn.prepareStatement(INSERT_EMPLOYEE_QUERY);
		insertEmployeeStatement.setInt(1, 1);
		insertEmployeeStatement.setString(2, "Test fname");
		insertEmployeeStatement.setString(3, "Test lname");
		insertEmployeeStatement.setString(4, "Test social");
		insertEmployeeStatement.setString(5, "Test phone");
		insertEmployeeStatement.setString(6, "Test address");
		insertEmployeeStatement.setString(7, "Test username");
		insertEmployeeStatement.setString(8, "Test password");
		if(insertEmployeeStatement.executeUpdate() == 1) {
			System.out.println("Employee inserted successfully");
		}
		} catch (SQLException e) {
		throw new RuntimeException(e);
		}
	}
	
	private static Properties getJdbcProperties() {
		Properties props = new Properties();
		try{
			props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("application.properties"));
		} catch (IOException e) {
			throw new RuntimeException("Failed to load [application.properties]");
		}
		return props;
	}
}
