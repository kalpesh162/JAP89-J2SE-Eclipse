package p1;

import java.util.Objects;

// must be comparabel
public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private double marks;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, double marks) {
		super();
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
		// return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "] \n";
		 String res=String.format("%-5d %-20s %-4f \n", id, name, marks);
		 return res;

	}

	@Override
	public int hashCode() {
		return Objects.hash(id, marks, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
				&& Objects.equals(name, other.name);
	}

	// Now if we want to add Student in treeset
	// then tree set is going to call this method
	// it is called on 2 Objects
	@Override
	public int compareTo(Student other) {
		/*
		 * if (this.id > other.id) return 0; else if (this.id < other.id) return 1; else
		 * return -1;
		 */

		Integer i1 = Integer.valueOf(this.id);
		Integer i2 = Integer.valueOf(other.id);

		return i1.compareTo(i2);

	}

}
