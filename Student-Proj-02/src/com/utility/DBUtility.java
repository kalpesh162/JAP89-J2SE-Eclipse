package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtility {

	private final static String URL = "jdbc:mysql://localhost:3306/jap89";
	private final static String USERNAME = "root";
	private final static String PASSWORD = "root";
	private DBUtility() {
	}

	public static Connection getDBConnection() {
		Connection con = null;
		try {
			// Step1 To Load Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 2 Create Connection
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			// CODE // Logger
			e.printStackTrace();
			System.err.print(e);
		}
		return con;
	}

}
