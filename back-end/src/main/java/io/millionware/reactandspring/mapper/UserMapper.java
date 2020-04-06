package io.millionware.reactandspring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import io.millionware.reactandspring.vo.UserVO;

@Mapper
public interface UserMapper {
	
	List<UserVO> userList();
	UserVO fetchUserById(int id);
	void updateUser(UserVO user);
	void insertUser(UserVO user);
	void deleteUser(int id);
}
