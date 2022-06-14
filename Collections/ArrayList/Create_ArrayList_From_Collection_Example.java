package com.java.Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

//Create an array List from another collection  using the 
//ArrayList (Collection c) Constructor

public class Create_ArrayList_From_Collection_Example {
	
	public static void main(String[] args) {
		
		List<Integer> firstFivePrimeNumbers = new ArrayList<Integer>();
		firstFivePrimeNumbers.add(2);
		firstFivePrimeNumbers.add(3);
		firstFivePrimeNumbers.add(5);
		firstFivePrimeNumbers.add(7);
		firstFivePrimeNumbers.add(11);
		System.out.println(firstFivePrimeNumbers);
		
		List<Integer> firstTenPrimeNumbers = new ArrayList<Integer>(firstFivePrimeNumbers);
		
		List<Integer> nextFivePrimeNumbers = new ArrayList<Integer>();
		nextFivePrimeNumbers.add(13);
		nextFivePrimeNumbers.add(17);
		nextFivePrimeNumbers.add(19);
		nextFivePrimeNumbers.add(23);
		nextFivePrimeNumbers.add(29);
		
		firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
		System.out.println(firstTenPrimeNumbers);


	}

}
