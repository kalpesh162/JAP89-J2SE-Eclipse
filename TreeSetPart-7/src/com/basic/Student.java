package com.basic;

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
		String res = String.format("%-5d  %-10s  %-4.2f \n", id, name, marks);
		return res;

	}

	/*
	// Marks
	@Override
	public int compareTo(Student other) {
		Double d1=Double.valueOf(this.marks);
		Double d2=Double.valueOf(other.marks);
		int res=d1.compareTo(d2);
		if(res==0) {
			res=this.name.compareTo(other.name);
		}
		
		return res;
	}
	
	*/
	
	@Override
	public int compareTo(Student other) {
		Double d1=Double.valueOf(this.marks);
		Double d2=Double.valueOf(other.marks);
		int res=d1.compareTo(d2);
		if(res==0) {
			res=-(this.name.compareTo(other.name));
		}
		
		return -res;
	}

}
