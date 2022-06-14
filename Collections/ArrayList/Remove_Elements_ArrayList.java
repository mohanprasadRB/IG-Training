package com.java.Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

//remove()
//removeAll()
//clear()

public class Remove_Elements_ArrayList {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Pineapple");
		fruits.add("Grapes");

		System.out.println(fruits);

		fruits.remove(0);
		System.out.println("After removing element at index 0 => " + fruits);

		fruits.remove("Grapes");
		System.out.println("After removing  Grapes element at index 5 => " + fruits);

		// Remove all the elements that exist in a given collection
		List<String> subfruitlist = new ArrayList<String>();
		subfruitlist.add("Apple");
		subfruitlist.add("Pineapple");

		System.out.println(subfruitlist);
		System.out.println("Fruit List Before RemoveAll Method\n" + fruits);
		fruits.removeAll(subfruitlist);
		System.out.println(fruits);

		fruits.clear();

		System.out.println(fruits);

	}
}
