package com.intern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.intern.Model.User;
import com.intern.Model.User_Role;
import com.intern.Service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/Admin/User/Add")
	public String addUser() {
		return "admin/user/useradd";
	}

	@PostMapping("/Admin/User/Add")
	public String addUser(@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname,
			@RequestParam("email") String email, @RequestParam("phone") long phone,
			@RequestParam("username") String username, @RequestParam("password") String password,
			@RequestParam("active") String active, @RequestParam("role") String role) {

		User user = new User(firstname, lastname, email, phone, username, password, active);
		User_Role ur = new User_Role();
		ur.setRole(role);

		user.setUser_role(ur);
		ur.setUser(user);

		userService.addUser(user);
		return "redirect:/Admin/User/Display";
	}

	@GetMapping("/Admin/User/Display")
	public String displayUser(Model model) {
		model.addAttribute("userinfo", userService.getAllUser());
		return "admin/user/userdisplay";
	}

	@GetMapping("/Admin/User/Edit/{id}")
	public String editUser(@PathVariable("id") int id, Model model) {
		model.addAttribute("userdata", userService.getUser(id));
		return "admin/user/useredit";
	}

	@PostMapping("/Admin/User/Update")
	public String updateUser(
			@RequestParam("id") int id,
			@RequestParam("firstname") String firstname, 
			@RequestParam("lastname") String lastname, 
			@RequestParam("email") String email,
			@RequestParam("phone") long phone,
			@RequestParam("username") String username, 
			@RequestParam("active") String active,
			@RequestParam("role") String role)
	{
//		User user = userService.getUser(user_id);
//		user.setId(user_id);
//		System.out.println(user.getId());
//		user.setFirstName(firstname);
//		user.setLastName(lastname);
//		user.setEmail(email);
//		user.setPhone(phone);
//		user.setUsername(username);
//		user.setActive(active);
		
		User user = new User(id, firstname, lastname, email, phone,
				username,active);
		User_Role ur=new User_Role();	
		ur.setRole(role);
		ur.setUser(user);
		user.setUser_role(ur);
		
		userService.updateUser(user);	
		return "redirect: /Admin/User/Display";
	}

//	@RequestMapping(method = RequestMethod.POST, value = "/Admin/User/Update/{id}")
//
//	public String updateUser(@RequestParam("id") int user_id,
//			@RequestParam("firstname") String firstname, 
//			@RequestParam("lastname") String lastname, 
//			@RequestParam("email") String email,
//			@RequestParam("phone") long phone,
//			@RequestParam("username") String username, 
//			@RequestParam("active") String active,
//			@RequestParam("role") String role, @PathVariable int id) {
//		
//		User user = new User(id, firstname, lastname, email, phone,
//				username,active);
//		userService.updateUser(id, user);
//		return "redirect: /Admin/User/Display";
//	}

	@GetMapping("/Admin/User/Delete/{id}")
	public String deleteUser(@PathVariable("id") int id) {
		User user = new User();
		user.setId(id);
		userService.deleteUser(id);
		return "redirect:/Admin/User/Display";
	}

}
