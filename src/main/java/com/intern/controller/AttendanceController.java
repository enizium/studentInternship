package com.intern.controller;

import java.security.Principal;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.intern.Model.Attendence;
import com.intern.Service.AttendenceService;

@Controller
public class AttendanceController {

	@Autowired
	AttendenceService attendenceService;

	@GetMapping({ "/Admin/Attendence/Add" })
	public String attendenceSheet() {
		return "admin/attendence/attendencesheet";
	}

	@PostMapping({ "/Admin/Attendence/Add", "/User/Attendence/Add" })
	public String updateAttendence(@RequestParam("date") Date date, @RequestParam("reason") String reason) {

		Attendence attendence = new Attendence(date, reason);
		attendenceService.addAttendence(attendence);

		return "redirect:/Admin/Student/Display";
	}

	@GetMapping({ "/Admin/Attendence/Display", "/User/Attendence/Display" })
	public String attedenceDisplay(Model model) {
		model.addAttribute("attendencedata", attendenceService.getAllAttendence());
		return "admin/attendence/attendencedisplay";
	}

//	@GetMapping("/Student/Attendence/Display")
//	public String attedencedisplay(Model model, Principal p) {
//		String username = p.getName();
//		model.addAttribute("attendencedata", attendenceService.findByUsername(username));
//		return "/frontend/attendence/attendencesheet";
//
//	}
	
	
	@GetMapping("/Student/Attendence/Display")
	public String attedencedisplay() {
//		String username = p.getName();
//		model.addAttribute("attendencedata", attendenceService.findByUsername(username));
		return "/frontend/attendence/attendencesheet";

	}

	@GetMapping({ "/Admin/Attendence/Delete", "/User/Attendence/Delete" })
	public String deleteAttendence(@PathVariable("id") int id) {
		Attendence attendence = new Attendence();
		attendence.setId(id);
		attendenceService.deleteAttendence(id);
		return "redirect:/User/Attendence/Display";

	}

	@GetMapping({ "/Admin/Attendence/Display/{username}", "/User/Attendence/Display/{username}" })
	public String editAttendec(@PathVariable("username") String username, Model model) {
		model.addAttribute("studentattendence", attendenceService.findByUsername(username));

		return "admin/attendence/editattendence";

	}

	@PostMapping({ "/Admin/Attendence/Update/{username}", "/User/Attendence/Update/{username}" })
	public String updateAttendence(@RequestParam("id") int id, @RequestParam("date") Date date,
			@RequestParam("reason") String reason) {

		Attendence attendence = new Attendence(id, date, reason);
		attendenceService.updateAttendence(attendence);

		return "redirect:/Admin/Student/Display";

	}

}
