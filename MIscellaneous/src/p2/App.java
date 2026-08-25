package p2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class App {

	public static void main(String[] args) throws IOException {

		Student student = new Student(11, "Sagar", 66.66);
		// Step File Create

		FileOutputStream fileOutputStream = new FileOutputStream("student.txt");

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

		objectOutputStream.writeObject(student);

		objectOutputStream.flush();

		objectOutputStream.close();
		fileOutputStream.close();

	}

}
