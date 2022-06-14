package com.java.Collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

//get the first element in the LinkedList
//get the last element in the LinkedList
//get the element at a given index in the LinkedList
//get all the Elements from LinkedList
public class Retrive_LinkedList_elements {

	public static void main(String[] args) {

		LinkedList<String> fruits = new LinkedList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("PineApple");

		System.out.println("Elemnts list \n" + fruits);
		String firstelement = fruits.getFirst();
		System.out.println("First Element in the list => " + firstelement);

		String lastElement = fruits.getLast();
		System.out.println("Last Element in the List  => " + lastElement);

		String pos = fruits.get(1);
		System.out.println("Element at Position 1 : " + pos);

		// Extended forloop
		for (String string : fruits) {
			System.out.println(string);

			// Using descendingIterator
			Iterator<String> itr = fruits.descendingIterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}

		}

	}
}
