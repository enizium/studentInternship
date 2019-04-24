package com.intern.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intern.Model.Attendence;
import com.intern.Repository.AttendenceRepository;
import com.intern.Service.AttendenceService;

@Service
public class AttendenceServiceImpl implements AttendenceService {

	@Autowired
	private AttendenceRepository attendenceRepository;

	@Override
	public List<Attendence> getAllAttendence() {
		List<Attendence> attendence = attendenceRepository.findAll();
		return attendence;
	}

	@Override
	public void addAttendence(Attendence attendence) {
		attendenceRepository.save(attendence);

	}

	@Override
	public void updateAttendence(Attendence attendence) {
		attendenceRepository.save(attendence);

	}

	@Override
	public void deleteAttendence(int id) {
		attendenceRepository.deleteById(id);

	}

	@Override
	public Attendence findByUsername(String username) {

		return attendenceRepository.findByStudent(username);
	}



 

}
