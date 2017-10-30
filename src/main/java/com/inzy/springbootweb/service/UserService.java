package com.inzy.springbootweb.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inzy.springbootweb.dao.UserDao;
import com.inzy.springbootweb.model.User;



@Service
@Transactional
public class UserService {

	
	@Autowired
	private UserDao userMapper;
	
	public List<User> searchAll(){
		List<User> list = userMapper.findAll();
		return list;
	}
	
	public void  addUser(User user){
		userMapper.addUser(user);
	}
	public void  deleteUser(String id){
		userMapper.deleteUser(id);
	}
	
	public UserDao getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserDao userMapper) {
		this.userMapper = userMapper;
	}
	
	
}
