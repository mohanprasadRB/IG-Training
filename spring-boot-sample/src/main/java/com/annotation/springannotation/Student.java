package com.annotation.springannotation;

public class Student {

	String name;

	public void study() {
		System.out.println(this.name + "  Studying");
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	/**
	 * 
	 */
	public Student() {
		super();
		System.out.println("no arg constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
