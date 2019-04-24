package com.intern.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

 
	//Student save(Student student);
	//List <Student> findAll();
	Student findById(int id);
	//void delete(int id);
	//void update(int id, Student student);
	
	 
}
