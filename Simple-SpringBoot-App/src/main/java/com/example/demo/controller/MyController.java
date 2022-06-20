package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Student;

@Controller
public class MyController {

	@Autowired
	@Qualifier("student1")
	private Student student;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	@ResponseBody
	public String home()
	{
		System.out.println("My name is mohan");
		return "hello";
	}
	
	

	@RequestMapping(value = "/home1", method = RequestMethod.GET)
	@ResponseBody
	public Student home1()
	{
		System.out.println("My name is mohan");
		return this.student;
	} 
}
