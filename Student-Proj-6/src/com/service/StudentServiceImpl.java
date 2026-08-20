package com.service;

import java.util.List;

import com.dao.StudentDAO;
import com.dao.StudentDAOImpl;
import com.exception.StudentServiceException;
import com.model.Student;

public class StudentServiceImpl implements StudentService {

	private StudentDAO studentDAO = new StudentDAOImpl();

	@Override
	public int registerStudent(Student student) {
		int res = 0;
		try {

			res = studentDAO.addStudent(student);

		} catch (Exception e) {

			StudentServiceException ex = new StudentServiceException("student add service ", e);
			ex.initCause(e);
			throw ex;
		}

		return res;
	}

	@Override
	public int removeStudent(int id) {
		int res = 0;
		if (id < 1)
			throw new StudentServiceException("id never -ve " + id);

		try {
			res = studentDAO.deleteStudent(id);
		} catch (Exception e) {

			StudentServiceException ex = new StudentServiceException("student add service ", e);
			throw ex;

		}
		return res;
	}

	@Override
	public int modifyStudent(Student student) {
		int res = 0;
		try {
			res = studentDAO.updateStudent(student);
		} catch (Exception e) {

			StudentServiceException ex = new StudentServiceException("student Modify service ", e);
			throw ex;

		}
		return res;
	}

	@Override
	public List<Student> getAllStudnets() {
		List<Student> list = null;
		try {
			list = studentDAO.findAllStudent();
		} catch (Exception e) {

			StudentServiceException ex = new StudentServiceException("student read Srvice Failed ", e);
			throw ex;

		}
		return list;
	}

	@Override
	public Student getStudentById(int id) {
		Student student = null;
		try {
			student = studentDAO.findStudentById(id);
		} catch (Exception e) {

			StudentServiceException ex = new StudentServiceException("student get By Id Service ", e);
			throw ex;

		}

		return student;
	}

}
