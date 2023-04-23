package com.mj.test.repository.interfaces;

import org.apache.ibatis.annotations.Mapper;

import com.mj.test.dto.UserFormDto;
import com.mj.test.repository.model.User;

@Mapper
public interface UserRepository {

	// 로그인 기능
	public User select(UserFormDto userFormDto);
	
	// 회원가입 기능
	public int insert(UserFormDto userFormDto);
	
	// 회원정보 수정 기능
	public int update(UserFormDto userFormDto);
	
	// 회원정보 삭제 기능
	public int delete(String id);
}
