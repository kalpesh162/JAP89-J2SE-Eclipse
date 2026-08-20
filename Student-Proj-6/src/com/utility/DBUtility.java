package com.utility;

import java.awt.image.DataBuffer;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.PrimitiveIterator;
import java.util.Properties;

public class DBUtility {

	private String URL;
	private String USERNAME;
	private String PASSWORD;
	private String DRIVER;

	private static DBUtility instance = null;

	private DBUtility() {

		Properties properties = new Properties();
		InputStream inputStream = DBUtility.class.getClassLoader().getResourceAsStream("db.properties");

		try {
			properties.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		URL = properties.getProperty("db.url");
		USERNAME = properties.getProperty("db.username");
		PASSWORD = properties.getProperty("db.password");
		DRIVER = properties.getProperty("db.driver");

		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static DBUtility getInstace() {
		if (instance != null)
			return instance;
		else
			instance = new DBUtility();
		return instance;
	}

	public Connection getDBConnection() {
		Connection con = null;
		try {

			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.print(e);
		}
		return con;
	}

}
