package cloning8;

public class Student implements Cloneable {
	private int id;
	private String name;
	private double marks;

	private Course course;

	public Student() {

	}

	public Student(int id, String name, double marks, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.course = course;
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", course=" + course + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Student cloned = (Student) super.clone();

		cloned.course = (Course) cloned.course.clone();

		return cloned;
	}

}
