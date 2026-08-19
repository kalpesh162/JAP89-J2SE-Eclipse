package com.validator;

import com.model.Student;

public class StudentValidator {

	public static boolean isStudentValid(Student student) {
		String pattern = "^[a-zA-Z]+$";
		boolean flag = true;
		if (student.getName().trim().equals("") || student.getName().trim().contains("null")) {
			flag = false;
			return flag;
		} else if (student.getName().matches(pattern))
			flag = true;
		else if (student.getMarks() >= 0 && student.getMarks() <= 100)
			flag = true;
		else if (student.getGender().toUpperCase().equals("MALE") || student.getGender().toUpperCase().equals("FEMALE"))
			flag = true;

		return flag;
	}

}
