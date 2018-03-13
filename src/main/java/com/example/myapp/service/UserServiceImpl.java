package com.example.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myapp.dao.UserDao;
import com.example.myapp.domain.User;
import com.example.myapp.utils.FakerUtils;
import com.github.javafaker.Faker;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	@Autowired
	FakerUtils faker;
	
	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Override
	public void addFakeUser() {
		Faker faker = FakerUtils.newFaker();
		User user = new User();
		
		user.setName(faker.name().fullName());
		user.setFirstName(faker.name().firstName());
		user.setLastName(faker.name().lastName());
		user.setAddress(faker.address().fullAddress());
		
		userDao.addUser(user);
	}
	

}
