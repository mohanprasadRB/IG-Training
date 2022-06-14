package com.java.Collections.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> fruits = new LinkedList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");

		System.out.println("initial linked list => " + fruits);

		fruits.add(2, "Orange");
		System.out.println("after adding orange => " + fruits);

		fruits.addFirst("Strawberry");
		System.out.println("Add at First position =>" + fruits);

		fruits.addLast("Cherry");
		System.out.println("Add at Last position =>" + fruits);

		System.out.println("Before sort\n" + fruits);
		// Collections.sort(fruits);
		System.out.println(fruits);

		fruits.stream().sorted().forEach(s -> System.out.print("  " + s));
		System.out.println("\n" + fruits);

		Collections.sort(fruits, (c1, c2) -> c2.compareTo(c1));
		System.out.println(fruits);
	}
}
