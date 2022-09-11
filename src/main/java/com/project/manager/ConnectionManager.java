package com.project.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	public static Connection getConnection() {
		
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		try {
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/HiFly","root","root");
			return con;
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	return null;  

	}
	}