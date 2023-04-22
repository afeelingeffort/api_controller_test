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
		User userEntity = userRepository.select(userFormDto);
		return userEntity;
	}
	
	public void createUser(UserFormDto userFormDto) {
		int resultRow = userRepository.insert(userFormDto);
		if(resultRow != 1) {
			System.out.println("회원가입에 실패하셨습니다.");
		}
	}
	
	public void updateUserById(UserFormDto userFormDto) {
		System.out.println(userFormDto.getPhoneNumber());
		int resultRow = userRepository.update(userFormDto);
		
		if(resultRow != 1) {
			System.out.println("회원정보수정에 실패하셨습니다.");
		}
	}
	
	public void deleteUserById(String id) {
		System.out.println(id);
		int resultRow = userRepository.delete(id);
		
		if(resultRow != 1) {
			System.out.println("회원 삭제에 실패하셨습니다.");
		}
	}
	
}
