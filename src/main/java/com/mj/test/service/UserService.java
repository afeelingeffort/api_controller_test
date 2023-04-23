package com.mj.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mj.test.dto.UserFormDto;
import com.mj.test.repository.interfaces.UserRepository;
import com.mj.test.repository.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	// 로그인 기능
	public User readUser(UserFormDto userFormDto) {
		User userEntity = userRepository.select(userFormDto);
		return userEntity;
	}
	
	// 회원가입 기능
	public void createUser(UserFormDto userFormDto) {
		int resultRow = userRepository.insert(userFormDto);
		if(resultRow != 1) {
			System.out.println("회원가입에 실패하셨습니다.");
		}
	}
	
	// 회원 정보 수정 기능
	public void updateUserById(UserFormDto userFormDto) {
		System.out.println(userFormDto.getPhoneNumber());
		int resultRow = userRepository.update(userFormDto);
		
		if(resultRow != 1) {
			System.out.println("회원정보수정에 실패하셨습니다.");
		}
	}
	
	// 회원 정보 삭제 기능
	public void deleteUserById(String id) {
		System.out.println(id);
		int resultRow = userRepository.delete(id);
		
		if(resultRow != 1) {
			System.out.println("회원 삭제에 실패하셨습니다.");
		}
	}
	
}
