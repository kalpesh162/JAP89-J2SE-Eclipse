package com.dao;

import com.model.Employee;

public interface EmployeeDao {

	boolean addEmployee(Employee employee);

	boolean removeEmployee(Employee employee);

	boolean isEmployeePresent(Employee employee);

	boolean updateEmployee(int id,Employee employee);

	int totalEmployees();

	void printEmployee(Employee employee);

}
