package cloning7;

public class Course  implements Cloneable{
	private int id;
	private String subName;
	private double time;

	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(int id, String subName, double time) {
		super();
		this.id = id;
		this.subName = subName;
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", subName=" + subName + ", time=" + time + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
