package com.intern.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class homeController {

	@GetMapping({"/home","/index","/"})
	public String homepage() {
		return "index";
	}
	
	@GetMapping({"Admin/Dashboard","/Admin"})
	public String adminDashboard() {
		return "admin/dashboard";
	}
	
	
	
}
