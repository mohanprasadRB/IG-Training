package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

 
public class Student {

	String name;
	
	/**
	 * @param name
	 */
	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	 

	public void studying() {
	 System.out.println(this.name+"  iz studying");
		
	}

	public Student()
	{
		
	}
}
