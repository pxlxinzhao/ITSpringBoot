package com.example.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SpringBootApplication
public class ApplicationConfig {

    @RequestMapping("/")
    @ResponseBody
    ModelAndView view() {
      return new ModelAndView("test");
    }
    
	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfig.class, args);
	}
}
