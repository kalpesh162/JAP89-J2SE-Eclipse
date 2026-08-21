package p1;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class App {

	public static void main(String[] args) {
		// Properties
		// Step 1 : Properties
		Properties properties = new Properties();

		// Step 2 : db.properties
		try {

			InputStream inputStream = new FileInputStream(new File("./db.properties"));

			// InputStream inputStream =
			// App.class.getClassLoader().getSystemResourceAsStream("db.properties");

			if (inputStream == null)
				System.out.println("File Not Loaded");
			//
			properties.load(inputStream);

		} catch (Exception e) {

		}
		System.out.println(properties.getProperty("db.url"));

	}

}
