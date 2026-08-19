package com.validator;

import com.model.Student;

public class StudentValidator {
	public static String msg = "";

	public static boolean isStudentValid(Student student) {
		String pattern = "^[a-zA-Z]+$";

		if (student.getName().trim().isEmpty() || student.getName().trim().contains("null")) {
			msg = "Name Can not be null or empty";
			return false;
		}

		if (!student.getName().matches(pattern)) {
			msg = "Name Conatains only alphabets";
			return false;
		}

		if (!(student.getMarks() >= 0 && student.getMarks() <= 100)) {
			msg = "Marks Must be between 0 & 100";
			return false;
		}

		if (!(student.getGender().toUpperCase().equals("MALE") || student.getGender().toUpperCase().equals("FEMALE"))) {
			msg = "ONLY MALE OR FEMALE";
			return false;
		}

		return true;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
