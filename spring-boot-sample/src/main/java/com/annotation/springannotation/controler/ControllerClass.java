package com.annotation.springannotation.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.annotation.springannotation.Student;

@Controller
public class ControllerClass {

	@Autowired
	@Qualifier("s1")
	private Student student;
	
	@RequestMapping(value ="/home",method = RequestMethod.GET)
	 @ResponseBody
	public String home()
	{
		
		System.out.println("Home method");
		return "Hello Mohan welcome to annotaion class ok";
		
	}
	
	
	@RequestMapping(value ="/home1",method = RequestMethod.GET)
	@ResponseBody
	public Student home1()
	{
		System.out.println("Home method");
		//return "Hello Mohan welcome to annotaion class ok";
		this.student.setName("Mohan");
		return this.student;
	}
	

	@RequestMapping(value ="/home2",method = RequestMethod.GET)
	@ResponseBody
	public Student home2(@RequestBody Student st)
	{
		//System.out.println("Home method");
		st.study(); 
		//this.student.setName("Mohan");
		return this.student;
	}
	
	@RequestMapping(value = "/user/{userId}",method = RequestMethod.GET)
	@ResponseBody
	public String user(@PathVariable("userId") Integer userId)
	{
		return String.valueOf(userId);
		
	}
	 
 }
