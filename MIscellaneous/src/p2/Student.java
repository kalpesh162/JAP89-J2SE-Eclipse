package p2;

import java.io.Serializable;

import newserilization.Person;

public class Student extends Person implements Serializable {
	private int id;
	private String name;
	// private static double marks;
	private transient double marks;

	public Student(int id, String name, double marks) {
		super(21);
		System.out.println("Student Parametrized cOnstructor ");
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

}
