package p3;

import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		Student s1 = new Student(101, "Amit", 85.5);
		Student s2 = new Student(102, "Priya", 91.0);
		Student s3 = new Student(103, "Rahul", 78.5);
		Student s4 = new Student(104, "Sneha", 88.0);
		Student s5 = new Student(105, "Karan", 95.5);

		HashSet<Student> jpa89 = new HashSet<Student>();
		jpa89.add(s1);
		jpa89.add(s2);
		jpa89.add(s3);
		jpa89.add(s4);
		jpa89.add(s5);
		jpa89.add(s1);
		jpa89.add(s2);
		jpa89.add(s3);
		jpa89.add(s4);
		jpa89.add(s5);

		System.out.println(jpa89);

		Student s6 = new Student(105, "Karan", 95.5);

		System.out.println("conatins   --> " + jpa89.contains(s6));
		System.out.println("remove   ---> " + jpa89.remove(s6));

		System.out.println(jpa89);

	}

}
