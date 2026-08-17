package com.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
	


	private final static String URL = "jdbc:mysql://localhost:3306/jap89";
	private final static String USERNAME = "root";
	private final static String PASSWORD = "root";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		int id = 1;
		String name = "Rekha";
		double marks = 76.66;

		// Step1 To Load Driver Class
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2 Create Connection

		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

		// Step 3 Create Query 1 2 3 1 2 3
		String sql = "UPDATE STUDENT SET name=? , marks=? WHERE id=?";

		// String sql = "insert into student (id,marks,name) values (?,?,?)";

		// ? place holder
		// Step 4 :Give Query to Prepare Statment
		PreparedStatement preparedStatement = con.prepareStatement(sql);

		// Step 5 : fill place holder
		preparedStatement.setInt(3, id);
		preparedStatement.setString(1, name);
		preparedStatement.setDouble(2, marks);

		// step 6 : ExcuteUpdate

		int row = preparedStatement.executeUpdate();
		System.out.println(row);

	}



}
