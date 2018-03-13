package com.example.myapp.service;

import java.util.List;

import com.example.myapp.domain.User;

public interface UserService {
	
	List<User> getAllUsers();

	void addFakeUser();

}
