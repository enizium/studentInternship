package com.intern.Service;

import java.util.List;

import com.intern.Model.Attendence;

public interface AttendenceService {

	List<Attendence> getAllAttendence();
	void addAttendence(Attendence attendence); 
	void updateAttendence(Attendence attendence);
	void deleteAttendence(int id);
	Attendence findByUsername(String username);
	
}
