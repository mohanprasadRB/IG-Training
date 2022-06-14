package com.java.Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class Create_HashSet_From_Collection {

	public static void main(String[] args) {

		Set<Integer> firstFiveEvenNumbers = new HashSet<Integer>();
		firstFiveEvenNumbers.add(2);
		firstFiveEvenNumbers.add(4);
		firstFiveEvenNumbers.add(6);
		firstFiveEvenNumbers.add(8);
		firstFiveEvenNumbers.add(10);
		System.out.println("First Five Even Numbers");
		System.out.println(firstFiveEvenNumbers);

		System.out.println("Even Number Set");
		Set<Integer> EvenNumberSet = new HashSet<Integer>(firstFiveEvenNumbers);
		System.out.println(EvenNumberSet);

		Set<Integer> SecondFiveEvenNumbers = new HashSet<Integer>();
		SecondFiveEvenNumbers.add(12);
		SecondFiveEvenNumbers.add(14);
		SecondFiveEvenNumbers.add(16);
		SecondFiveEvenNumbers.add(18);
		SecondFiveEvenNumbers.add(20);
		System.out.println("Secod Even number Set");
		System.out.println(SecondFiveEvenNumbers);

		EvenNumberSet.addAll(SecondFiveEvenNumbers);
		System.out.println("Set after Addall method");
		System.out.println(EvenNumberSet);

		EvenNumberSet.stream().sorted().forEach(s -> System.out.print(" " + s));

	}
}
