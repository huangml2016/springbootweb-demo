package com.inzy.springbootweb.dao;

import java.util.List;

import com.inzy.springbootweb.model.User;


public interface UserDao  {
	List<User> findAll();
	
	void  addUser(User user);
	
	void  deleteUser(String id);
}
