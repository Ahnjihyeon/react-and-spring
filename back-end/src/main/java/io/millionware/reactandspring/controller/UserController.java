package io.millionware.reactandspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.millionware.reactandspring.mapper.UserMapper;
import io.millionware.reactandspring.vo.UserVO;


@CrossOrigin(origins="*", maxAge = 3600)
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserMapper userMapper;
	
	@GetMapping
	public List<UserVO> userList(){
		return userMapper.userList();
	}
	
	@PostMapping
	void insertUser (@RequestBody UserVO user) {
		userMapper.insertUser(user);
	}
	

}
