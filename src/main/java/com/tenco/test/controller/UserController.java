package com.tenco.test.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@Autowired
	private HttpSession session;
	
	@GetMapping("/login")
	public String login() {
		return "/user/login";
	}

	@PostMapping("/login-proc")
	public String loginProc(UserFormDto userFormDto) {

		// 유효성 검사
		
		// 서비스 호출
		User user = userService.readUser(userFormDto);
		session.setAttribute("id", user.getId());
		
		System.out.println(user);
		return "/index";
	}

	@GetMapping("/join")
	public String join() {
		return "/user/join";
	}

	@PostMapping("/join-proc")
	public String joinProc(UserFormDto userFormDto) {
		// 서비스 호출
		userService.createUser(userFormDto);
		return "redirect:/main/home";
	}
	
	@GetMapping("/modify-info")
	public String modifyInfo() {
		return "/user/modifyInfo";
	}
	
	@PostMapping("/modify-proc")
	public String modifyProc(UserFormDto userFormDto) {
		String id = (String)session.getAttribute("id");  
		userFormDto.setId(id);
		userService.updateUserById(userFormDto);
		return "redirect:/main/home";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable String id) {
		userService.deleteUserById(id);
		return "redirect:/main/home";
	}

}
