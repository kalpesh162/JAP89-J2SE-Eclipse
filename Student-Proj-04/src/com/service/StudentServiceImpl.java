package com.service;

import java.util.List;

import com.dao.StudentDAO;
import com.dao.StudentDAOImpl;
import com.model.Student;

public class StudentServiceImpl implements StudentService {

	private StudentDAO studentDAO = new StudentDAOImpl();

	@Override
	public int registerStudent(Student student) {
		return studentDAO.addStudent(student);
	}

	@Override
	public int removeStudent(int id) {

		return studentDAO.deleteStudent(id);
	}

	@Override
	public int modifyStudent(Student student) {
		return studentDAO.updateStudent(student);
	}

	@Override
	public List<Student> getAllStudnets() {
		return studentDAO.findAllStudent();
	}

	@Override
	public Student getStudentById(int id) {

		return studentDAO.findStudentById(id);
	}

}
