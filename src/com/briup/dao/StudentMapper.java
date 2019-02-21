package com.briup.dao;

import java.util.List;

import com.briup.bean.Student;

public interface StudentMapper {
	void saveStudent(Student stu);
	Student findStudentById(Integer id);
	List<Student> findAllStudent();
	void deleteStudentById(Integer id);
	void updateStudent(Student stu);
	//
	void insertStudentPhone(Student stu);
	Student findStudentPhone(Integer id);
}
