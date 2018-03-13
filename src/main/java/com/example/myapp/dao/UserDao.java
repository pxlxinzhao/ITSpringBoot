package com.example.myapp.dao;

import java.util.List;

import com.example.myapp.domain.User;

public interface UserDao {

	List<User> getAllUsers();

	void addUser(User user);
	
}
