package com.example.myapp.utils;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

@Component
public class FakerUtils extends Faker{
	public static Faker newFaker() {
		return new Faker();
	}
}
