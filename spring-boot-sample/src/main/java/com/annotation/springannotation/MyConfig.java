package com.annotation.springannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class MyConfig {

	@Bean("s1")
	@Lazy
	public Student getStudent() {
		System.out.println("Student first object created");
		return new Student("S1");
	}

	@Bean("s2")
	@Lazy
 	public Student newStudent() {
		System.out.println("Student Second object created");
		return new Student("s2");
	}

}
