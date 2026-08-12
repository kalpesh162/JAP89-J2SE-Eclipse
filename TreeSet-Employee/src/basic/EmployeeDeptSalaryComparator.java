package basic;

import java.util.Comparator;

public class EmployeeDeptSalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int res = o1.getName().compareTo(o2.getName());
		if (res == 0) {
			Double d1 = Double.valueOf(o1.getSalary());
			Double d2 = Double.valueOf(o2.getSalary());
			res = -(d1.compareTo(d2));
		}
		return res;
	}

}
