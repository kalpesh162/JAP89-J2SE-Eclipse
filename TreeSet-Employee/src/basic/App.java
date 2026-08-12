package basic;

import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "IT", 60000);
		Employee e2 = new Employee(2, "HR", 50000);
		Employee e3 = new Employee(3, "IT", 80000);
		Employee e4 = new Employee(4, "HR", 70000);

		TreeSet<Employee> empSet = new TreeSet<Employee>(new EmployeeDeptSalaryComparator());
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);

		for (Employee emp : empSet)
			System.out.println(emp);

	}

}
