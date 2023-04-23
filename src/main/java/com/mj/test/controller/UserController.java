package com.mj.test.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mj.test.dto.UserFormDto;
import com.mj.test.repository.model.User;
import com.mj.test.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private HttpSession session;
	
	// index.jsp 파일의 a태그
	@GetMapping("/login")
	public String login() {
		return "/user/login";
	}

	// login.jsp 파일의 form 태그
	@PostMapping("/login-proc")
	public String loginProc(UserFormDto userFormDto) {

		// 유효성 검사
		
		// 서비스 호출
		User user = userService.readUser(userFormDto);
		session.setAttribute("id", user.getId());
		
		System.out.println(user);
		return "/index";
	}

	// index.jsp 파일의 a태그
	@GetMapping("/join")
	public String join() {
		return "/user/join";
	}

	// join.jsp 파일의 form 태그
	@PostMapping("/join-proc")
	public String joinProc(UserFormDto userFormDto) {
		// 서비스 호출
		userService.createUser(userFormDto);
		return "redirect:/main/home";
	}
	
	// index.jsp 파일의 a 태그
	@GetMapping("/modify-info")
	public String modifyInfo() {
		return "/user/modifyInfo";
	}
	
	// modifyInfo.jsp 파일의 form 태그
	@PostMapping("/modify-proc")
	public String modifyProc(UserFormDto userFormDto) {
		String id = (String)session.getAttribute("id");  
		userFormDto.setId(id);
		userService.updateUserById(userFormDto);
		return "redirect:/main/home";
	}
	
	// modifyInfo.jsp 파일의 a 태그
	// GetMapping은 바디가 없으므로 헤더에 담아서 오니까 @PathVariable 사용 
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable String id) {
		userService.deleteUserById(id);
		return "redirect:/main/home";
	}

}
