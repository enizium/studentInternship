package com.intern.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.intern.Model.Mentor;
import com.intern.Model.Student;
import com.intern.Service.MentorService;
import com.intern.Service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;
	@Autowired
	MentorService mentorService;

	@GetMapping("/Admin/Student/Add")
	public String addStudent(Model model) {
		model.addAttribute("mentordata", mentorService.getAllMentor());
		return "admin/student/studentadd";
	
	}
	@GetMapping("/Admin/Student/Display")
	public String displayStudent(Model model) {
		model.addAttribute("studentdata", studentService.getAllStudent());
		
		return "admin/student/studentdisplay";
	}
	
	@PostMapping("/Admin/Student/Add")
	public String addStudent(@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname,
			@RequestParam("phone") long phone, @RequestParam("course") String course,
			@RequestParam("address") String address, @RequestParam("date") Date date,
			@RequestParam("mentor") Mentor mentor) {
		Student student = new Student(firstname, lastname, course, address, phone, date, mentor);
		studentService.addStudent(student);
		return "redirect:/Admin/Student/Display";
	}

	@GetMapping("/Admin/Student/Edit/{id}")
	public String editStudent(@PathVariable("id") int id, Model model) {
		model.addAttribute("studentdata", studentService.getStudent(id));
		model.addAttribute("mentordata", mentorService.getAllMentor());
		return "admin/student/studentedit";
	}

	@PostMapping("/Admin/Student/Update/{id}")
	public String updateStudent(@RequestParam("id") int id, @RequestParam("firstname") String firstname,
			@RequestParam("lastname") String lastname, @RequestParam("phone") long phone,
			@RequestParam("course") String course, @RequestParam("address") String address,
			@RequestParam("date") Date date, @RequestParam("mentor") Mentor mentor) {
		
		//Mentor m= new Mentor();
		//m.setId(mentor);
		Student student = new Student(id, firstname, lastname, course, address, phone, date);
		studentService.addStudent(student);
		return "redirect:/Admin/Student/Display";

	}

	@GetMapping("/Admin/Student/Delete/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		Student student =new Student();
		student.setId(id);
		studentService.deleteStudent(id);
		return "redirect:/Admin/Student/Display";
	}


}
