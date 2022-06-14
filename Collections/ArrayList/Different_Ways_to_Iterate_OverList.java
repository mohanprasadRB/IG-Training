package com.java.Collections.ArrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Different_Ways_to_Iterate_OverList {

	public static void main(String[] args) {

		List<String> courses = Arrays.asList("c", "C++", "Java", "Spring", "Hibernate");

		// Basic ForLoop
		for (int i = 0; i < courses.size(); i++)
			System.out.println(courses.get(i));

		// Enhanced ForEach Loop
		System.out.println("====================Enhanced ForEach Loop");
		for (String string : courses) {
			System.out.println(string);
		}

		// Basic loop with iterator
		System.out.println("====================Basic loop with iterator");
		for (Iterator<String> itr = courses.iterator(); itr.hasNext();) {
			String course = itr.next();
			System.out.println(course);
		}

		// iterator with while loop
		System.out.println("====================Iterator with while loop");
		Iterator<String> itr = courses.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Java8 stream + lambda Expression
		System.out.println("====================Java8 stream + lambda Expression");
		courses.parallelStream().forEach(course -> System.out.println(course));
		// courses.stream().forEach(System.out::println);

		// Java8 froEach
		System.out.println("====================	//Java8 froEach");

		courses.forEach((course) -> System.out.println(course));

	}

}
