package com.java.Collections.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapUSerDefinedExample {

	public static void main(String[] args) {

		Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
		studentMap.put(1, new Student("Mohan", "Prasad"));
		studentMap.put(2, new Student("RB", "Mohan"));
		studentMap.put(3, new Student("RB", "MohanPrasad"));

		System.out.println(studentMap);

		for (Entry<Integer, Student> entry : studentMap.entrySet()) {
			System.out.print("Key => " + entry.getKey());
			System.out.println("  Value => " + entry.getValue());
		}

	}

}

class Student {
	private String firstName;
	private String lastName;

	/**
	 * @param firstName
	 * @param lastName
	 */
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + "] "+"\n";
	}

}