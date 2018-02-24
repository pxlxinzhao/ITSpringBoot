package com.example.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Controller
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
      return "Hello World!";
    }
    
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
