package com.demo.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.User;
import com.demo.service.UserService;

@RestController
@RequestMapping("/secure")
public class HomeController {

	@Autowired
	private UserService userService;
	@GetMapping("/home")
	public String HomePage() {
		return "Home";
	}
	@GetMapping("/user")
	public List<User> getAllusers(){
		return userService.getUser();
	}
	@GetMapping("/user-name")
	public String getLoggeduser(Principal principal) {
		return principal.getName();
	}
}
