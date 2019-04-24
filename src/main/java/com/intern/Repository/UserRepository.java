package com.intern.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.Model.User;

public interface UserRepository extends JpaRepository <User, Integer>{
	
	public User findById(int id);
}
