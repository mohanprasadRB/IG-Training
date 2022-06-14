package com.java.Collections.Set;

import java.util.HashSet;
import java.util.Set;

//remove()
//removeAll()
//clear()
public class ReemovingElementFromHashSet {

	public static void main(String[] args) {

		Set<Integer> numbers = new HashSet<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(6);
		numbers.add(5);
		numbers.add(8);
		numbers.add(7);

		// using remove method
		System.out.println(numbers);
		boolean result = numbers.remove(1);
		System.out.println(numbers);

		// using Remove all
		Set<Integer> evenNumbers = new HashSet<Integer>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		evenNumbers.add(6);
		evenNumbers.add(8);
		evenNumbers.add(10);
		evenNumbers.add(12);

		System.out.println(evenNumbers);

		numbers.removeAll(evenNumbers);
		System.out.println(numbers);

		// clearMethod
		numbers.clear();
		System.out.println(numbers);

	}
}
