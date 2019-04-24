package com.intern.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.Model.Attendence;

public interface AttendenceRepository extends JpaRepository<Attendence, Integer>  {


	Attendence findByStudent(String username);
		
	
 
}
