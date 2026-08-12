package basic;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "] \n";
	}

	@Override
	public int compareTo(Employee other) {
		int res = this.name.compareTo(other.name);
		if (res == 0) {
			Double d1 = Double.valueOf(this.salary);
			Double d2 = Double.valueOf(other.salary);
			res = d1.compareTo(d2);
		}

		return res;
	}

}
