package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

@Controller
public class Myclass {

	@Bean("s1")
	 	public Student getStudent()
	{
		System.out.println("Hello Object created.....ha ha Constructor called ");
		return new Student("s1");
	}
	
	@Bean("s2")
	public Student newStudent()
	{
		System.out.println("new student object  called");
		return new Student("s2");
	}
}
