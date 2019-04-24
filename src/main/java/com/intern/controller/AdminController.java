package com.intern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.intern.Model.Mentor;
import com.intern.Service.MentorService;

@Controller
//@RequestMapping("/Admin")
public class AdminController {


	@Autowired
	MentorService mentorService;

	@GetMapping("/Admin/Mentor/Add")
	public String AddMentor() {
		return "admin/mentor/mentoradd";
	}

	@RequestMapping(value = "/Admin/Mentor/Add", method = RequestMethod.POST)
	public String addMentor(@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname,
			@RequestParam("phone") long phone, @RequestParam("address") String address,
			@RequestParam("mentorship") String mentorship) {

		Mentor mentor = new Mentor(firstname, lastname, address, phone, mentorship);
		mentorService.addMentor(mentor);
		return "redirect:/Admin/Mentor/Display";

	}

	@GetMapping("/Admin/Mentor/Display")
	public String displayMentor(Model model) {
		model.addAttribute("mentordata", mentorService.getAllMentor());
		return "admin/mentor/mentordisplay";
	}

	@GetMapping("/Admin/Mentor/Edit/{id}")
	public String editMentor(@PathVariable("id") int id, Model model) {
		model.addAttribute("mentordata", mentorService.getMentor(id));
		return "admin/mentor/mentoredit";
	}

//	@RequestMapping(method=RequestMethod.PUT, value="/Admin/Mentor/Update/{id}")
//	public String updateMentor(@RequestBody Mentor mentor, @PathVariable int id) {
//		mentorService.updateMentor(id, mentor);
//		
//		return "redirect:/Admin/Mentor/Display";
//		
//	}

	@PostMapping("/Admin/Mentor/Update")
	public String updateMentor(@RequestParam("id") int mentor_id, @RequestParam("firstname") String firstname,
			@RequestParam("lastname") String lastname, @RequestParam("phone") long phone,
			@RequestParam("address") String address, @RequestParam("mentorship") String mentorship) {

		Mentor mentor = new Mentor(mentor_id, firstname, lastname, address, phone, mentorship);
		mentorService.updateMentor(mentor);
		return "redirect:/Admin/Mentor/Display";
	}

	@GetMapping("/Admin/Mentor/Delete/{id}")
	public String delteMentor(@PathVariable("id") int id) {
		Mentor mentor = new Mentor();
		mentor.setId(id);
		mentorService.deleteMentor(id);

		return "redirect:/Admin/Mentor/Display";
	}

}
