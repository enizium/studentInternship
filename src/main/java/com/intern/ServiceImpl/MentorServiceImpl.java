package com.intern.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intern.Model.Mentor;
import com.intern.Repository.MentorRepository;
import com.intern.Service.MentorService;

@Service
public class MentorServiceImpl implements MentorService{

	@Autowired
	private MentorRepository mentorRepository;
	
	@Override
	public void addMentor(Mentor mentor) {
		mentorRepository.save(mentor);		
	}

	@Override
	public List<Mentor> getAllMentor() {
		List<Mentor> mentor =  mentorRepository.findAll();
		//.forEach(mentor::add);
		return mentor;
	}

	@Override
	public Mentor getMentor(int id) {
		
		return mentorRepository.findById(id);
	}


	@Override
	public void deleteMentor(int id) {
		mentorRepository.deleteById(id);
	}

	@Override
	public void updateMentor(Mentor mentor) {
		mentorRepository.save(mentor);
		
	}



}
