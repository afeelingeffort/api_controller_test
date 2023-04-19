package com.tenco.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tenco.test.dto.UserFormDto;
import com.tenco.test.repository.interfaces.UserRepository;
import com.tenco.test.repository.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User readUser(UserFormDto userFormDto) {
		User user = userRepository.select(userFormDto);

		return user;
	}
	
}
