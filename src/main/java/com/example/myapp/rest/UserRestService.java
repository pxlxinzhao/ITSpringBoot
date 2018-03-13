package com.example.myapp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.myapp.domain.User;
import com.example.myapp.service.UserService;

@Controller
@RequestMapping("/user")
public class UserRestService {

	@Autowired
	UserService userService;

	@GetMapping("/list")
	@ResponseBody
	public ResponseEntity<List<User>> list() {
		List<User> list = userService.getAllUsers();

		return new ResponseEntity<List<User>>(list, HttpStatus.OK);
	}

	@GetMapping("/addFake")
	@ResponseBody
	public ResponseEntity<String> add() {
		userService.addFakeUser();

		return new ResponseEntity<String>("added", HttpStatus.OK);
	}

}
