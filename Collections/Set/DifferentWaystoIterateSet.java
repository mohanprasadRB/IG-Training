package com.java.Collections.Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DifferentWaystoIterateSet {

	public static void main(String[] args) {

		Set<String> courses = new HashSet<String>();
		courses.add("Java");
		courses.add("c");
		courses.add("C++");
		courses.add("Python");
		courses.add("Scala");

		// Enhanced Forloop
		for (String string : courses) {
			System.out.println(string);
		}

		// Basic loop with iterator
		for (Iterator<String> itr = courses.iterator(); itr.hasNext();)
			System.out.println(itr.next());

		// whileloop with Iterator
		Iterator<String> itr = courses.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// JDK 8 forEach() method with lambda
		courses.forEach(course -> System.out.println(course));

		// JDK 8 Streaming + foreach() + lambda Expression
		courses.stream().filter(course -> !"Java".equals(course)).forEach(course -> System.out.println(course));

	}
}
