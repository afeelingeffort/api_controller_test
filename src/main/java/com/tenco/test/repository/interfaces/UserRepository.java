package com.tenco.test.repository.interfaces;

import org.apache.ibatis.annotations.Mapper;

import com.tenco.test.dto.UserFormDto;
import com.tenco.test.repository.model.User;

@Mapper
public interface UserRepository {

	public User select(UserFormDto userFormDto);
	
	public int insert(UserFormDto userFormDto);
	
	public int update(UserFormDto userFormDto);
	
	public int delete(String id);
}
