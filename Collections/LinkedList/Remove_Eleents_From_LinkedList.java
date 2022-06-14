package com.java.Collections.LinkedList;

import java.util.LinkedList;

public class Remove_Eleents_From_LinkedList {

	public static void main(String[] args) {

		LinkedList<String> fruitlist = new LinkedList<String>();
		fruitlist.add("Apple");
		fruitlist.add("Banana");
		fruitlist.add("Mango");
		fruitlist.add("Pineapple");

		System.out.println("Initial LinkedList");
		System.out.println(fruitlist);

		// Remove the first element in the linked list
		String element = fruitlist.removeFirst();
		System.out.println("\nAfter Removing the First element");
		System.out.println(fruitlist);

		String lastelement = fruitlist.removeLast();
		System.out.println("\nAfter Removing the Last element");
		System.out.println(fruitlist);
		
		//Clear the List
		fruitlist.clear();
		System.out.println("\nAfter the Clear Method");
		System.out.println(fruitlist);
	}
}
