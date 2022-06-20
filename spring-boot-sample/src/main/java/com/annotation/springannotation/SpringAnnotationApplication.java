package com.annotation.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnnotationApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("s2")
	private Student student;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAnnotationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 
		 this.student.study();
		  
		
	}

}
