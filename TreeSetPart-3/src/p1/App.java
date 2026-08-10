package p1;

import java.util.Comparator;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		Student s1 = new Student(101, "Shah Rukh Khan", 95.5);
		Student s2 = new Student(102, "Amitabh Bachchan", 92.0);
		Student s3 = new Student(103, "Alia Bhatt", 88.5);
		Student s4 = new Student(104, "Ranbir Kapoor", 90.0);
		Student s5 = new Student(105, "Deepika Padukone", 94.5);
		Student s6 = new Student(103, "Alia Bhatt", 88.5);
		Student s7 = new Student(104, "Ranbir Kapoor", 90.0);

		TreeSet<Student> jpa89 = new TreeSet<Student>();
		jpa89.add(s1);
		jpa89.add(s2);
		jpa89.add(s3);
		jpa89.add(s4);
		jpa89.add(s5);
		jpa89.add(s6);
		jpa89.add(s7);

		System.out.println(jpa89);

		System.out.println("-----------------------------------------");

		Comparator<Student> byName = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {

				return o1.getName().compareTo(o2.getName());
			}
		};

		TreeSet<Student> jpa89Name = new TreeSet<Student>(byName);
		jpa89Name.add(s1);
		jpa89Name.add(s2);
		jpa89Name.add(s3);
		jpa89Name.add(s4);
		jpa89Name.add(s5);

		for (Student s : jpa89Name)
			System.out.println(s);

		System.out.println("------------------------");

		// Here we are passing Anonymous Inner class as argument to Constructor
		TreeSet<Student> jpa89Marks = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {

				return Double.valueOf(o1.getMarks()).compareTo(o2.getMarks());
			}
		});
		jpa89Marks.add(s1);
		jpa89Marks.add(s2);
		jpa89Marks.add(s3);
		jpa89Marks.add(s4);
		jpa89Marks.add(s5);

		for (Student s : jpa89Marks)
			System.out.println(s);

	}

}
