package com.tenco.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tenco.test.dto.UserFormDto;
import com.tenco.test.repository.model.User;
import com.tenco.test.service.UserService;

@Controller
@RequestMapping("/test")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public String login() {
		return "/user/login";
	}
	
	@PostMapping("/login-proc")
	public String loginProc(UserFormDto userFormDto) {
		
		// 유효성 검사
//		if(userFormDto.getId() == null || userFormDto.getId().isEmpty()) {
//			
//		}
		
		// 서비스 호출
		User user = userService.readUser(userFormDto);
		System.out.println(user.getId());
		System.out.println(user.getPw());
		
		
		return "/index";
	}
	
}
