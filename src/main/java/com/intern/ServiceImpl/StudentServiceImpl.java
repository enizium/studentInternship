package com.intern.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intern.Model.Student;
import com.intern.Repository.StudentRepository;
import com.intern.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void addStudent(Student student) {
		studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> student=studentRepository.findAll();
		return student;
	}

	@Override
	public Student getStudent(int id) {
		return studentRepository.findById(id);
	}

	@Override
	public void updateStudent( Student student) {
		studentRepository.save(student); 
		
	}
	@Override
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
		
	}


}
