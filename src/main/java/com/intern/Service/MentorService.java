package com.intern.Service;

import java.util.List;

import com.intern.Model.Mentor;

public interface MentorService {

	void addMentor(Mentor mentor);

	public List<Mentor> getAllMentor(); 

	public void updateMentor(Mentor mentor);

	public void deleteMentor(int id);

	Mentor getMentor(int id);

}
