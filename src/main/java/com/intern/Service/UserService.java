package com.intern.Service;

import java.util.List;
import com.intern.Model.User;

public interface UserService {

	public void addUser(User user);
	
	public List<User> getAllUser();
	
	public User getUser(int id);
	
	//public void updateUser(int id, User user);
	
	public void deleteUser(int id);

	public void updateUser(User user);
	
}
