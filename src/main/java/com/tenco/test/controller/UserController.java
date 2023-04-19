package com.tenco.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tenco.test.repository.model.User;

@Controller
@RequestMapping("/test")
public class UserController {

	@GetMapping("/login")
	public String login(User user) {
		System.out.println(user.getId());
		System.out.println(user.getPw());
		return user.toString();
	}
	
}
