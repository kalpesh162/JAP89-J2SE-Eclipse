package assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class Employee {
	private String name;
	private int salary;
	private String department;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int salary, String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		
		return String.format("%s   %d  %s \n", name,salary,department);
	}

	@Override
	public int hashCode() {
		return Objects.hash(department, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && Objects.equals(name, other.name)
				&& salary == other.salary;
	}

}

public class Assignment07 {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(
				new Employee("Ram", 60000, "IT"),
				new Employee("Shyam", 45000, "HR"),
				new Employee("Amit", 70000, "IT"), 
				new Employee("Ravi", 50000, "Finance"),
				new Employee("Neha", 80000, "HR"));

		
		//1. Filter employees with salary > 50,000
		
		  employees.stream()
		  		   .filter(e -> e.getSalary()>50000)
		  		   .forEach(System.out::println);
		 
		  System.out.println("------------------------");
		//2. Get employee names only
		  employees.stream()
		           .map(e -> e.getName())
		           .map(e -> e.toUpperCase())
		           .forEach(System.out::println);
		  
		  System.out.println("Printing lenght of each Name");
		  employees.stream()
		  		   .map(e -> e.getName())
		  		   .map(e -> e.length())
		  		   .forEach(System.out::println);
		  
		  
		//2. Get employee names only
		  employees.stream()
		           .map(Employee::getName)
		           .map(String::toLowerCase)
		           .forEach(System.out::println);
		 
		  
		//3 :IT Department Employees
		//Get names of employees who belong to "IT" department
	
		  

	}

}
