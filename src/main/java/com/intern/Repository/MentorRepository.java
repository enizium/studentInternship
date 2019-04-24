package com.intern.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.Model.Mentor;

public interface MentorRepository  extends JpaRepository<Mentor, Integer>{
	
		Mentor findById(int id);
}
   