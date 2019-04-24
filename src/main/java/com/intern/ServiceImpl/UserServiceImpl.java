package com.intern.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intern.Model.User;
import com.intern.Repository.UserRepository;
import com.intern.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getAllUser() {
		List<User> user =userRepository.findAll();
		return user;
	}

	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}

	@Override
	public User getUser(int id) {
		
		return userRepository.findById(id);
	}

//	@Override
//	public void updateUser(int id, User user) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public void deleteUser(int id) {
		userRepository.deleteById(id);

		
	}

	@Override
	public void updateUser(User user) {
//		user.setId(0);
		userRepository.save(user);
		
	}

}
