package com.example.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserRestService {

	@Autowired
	UserDao userDao;
	
    @GetMapping("/list")
    @ResponseBody
    public ResponseEntity<List<User>> list() {
    	List<User> list = userDao.getAllUsers();
    
        return new ResponseEntity<List<User>>(list, HttpStatus.OK);
    }
    
    @GetMapping("/add")
    @ResponseBody
    public ResponseEntity<String> add() {
    	userDao.addTestUser();
    
      return new ResponseEntity<String>("added", HttpStatus.OK);
    }
    
}
