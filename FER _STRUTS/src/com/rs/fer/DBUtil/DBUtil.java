package com.rs.fer.DBUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBUtil {
	public static  Connection getConnection()  {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			connection =   (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3310/fer",
					"root", "root");
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;

	}

	public static void closeConnection(java.sql.Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

	


