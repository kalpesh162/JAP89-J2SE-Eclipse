package cloning6;

public class App {

	public static void main(String[] args) throws CloneNotSupportedException {
		Course course = new Course(101, "JAVA", 6.3);
		Student student = new Student(111, "Pawan", 66.55, course);

		System.out.println(student);

		Student student2 = (Student) student.clone();
		System.out.println(student2);

		System.out.println("--------------------------------------");
		System.out.println(student.hashCode());
		System.out.println(student2.hashCode());

		student.getCourse().setSubName("C#");

		System.out.println(student);
		System.out.println(student2);

	}
}
