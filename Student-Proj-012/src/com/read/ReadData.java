package com.read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadData {

	private final static String URL = "jdbc:mysql://localhost:3306/jap89";
	private final static String USERNAME = "root";
	private final static String PASSWORD = "root";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Step1 To Load Driver Class
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2 Create Connection

		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

		// Step 3 Create Query 1 2 3 1 2 3
		String sql = "SELECT * FROM STUDENT";
		// ? place holder
		// Step 4 :Give Query to Prepare Statment
		PreparedStatement preparedStatement = con.prepareStatement(sql);

		// step 5 : Excute
		ResultSet rs = preparedStatement.executeQuery();

		System.out.printf("%-5s%-10s%-2s \n", "ID", "NAME", "MARKS");
		System.out.println("===========================");
		while (rs.next()) {

			// rs.getInt(1);
			System.out.printf("%-5d", rs.getInt("id"));
			// rs.getString(2)
			System.out.printf("%-10s", rs.getString("name"));
			// rs.getDouble(3)
			System.out.printf("%-2.2f", rs.getDouble("marks"));
			System.out.println();

		}

		rs.close();
		con.close();

	}

}
