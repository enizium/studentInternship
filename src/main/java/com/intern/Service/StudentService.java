package com.intern.Service;


import java.util.List;

import com.intern.Model.Student;

public interface StudentService {
	
	public void addStudent(Student student);
	public List<Student> getAllStudent();
	public Student getStudent(int id);
	public void updateStudent(Student student);
	public void deleteStudent(int id);
	

}
