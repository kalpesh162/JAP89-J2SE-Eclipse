package newserilization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import p2.Student;

public class DeserilizeTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fin = new FileInputStream("stud.txt");

		ObjectInputStream objectInputStream = new ObjectInputStream(fin);

		// Object object=objectInputStream.readObject();

		Student student = (Student) objectInputStream.readObject();
		

		System.out.println(student);

		objectInputStream.close();
		fin.close();

	}

}
