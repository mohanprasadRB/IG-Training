package com.java.Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;
 
public class Acess_Elements_From_ArrayList {

		public static void main(String[] args) {
			
			List<String> topProgrammingLanguages = new ArrayList<String>();
			
			
			//Check if an ArrayList is Empty
			System.out.println("Is the top ProgramingLanguages is Empty ? : "
								+topProgrammingLanguages.isEmpty());
			
			topProgrammingLanguages.add("C");
			topProgrammingLanguages.add("Java");
			topProgrammingLanguages.add("Python");
			topProgrammingLanguages.add("C++");
			topProgrammingLanguages.add(".net");
			
			
			//Find the Size of an ArrayList using the size() Method
			System.out.println("Here the  "+topProgrammingLanguages.size()
								+" Top Programin Languages in the world ");
			
			//Retrive the element at given index using get()  Method
			String Bestprogramming = topProgrammingLanguages.get(1);
			System.out.println("Best programming Language  => "+Bestprogramming);

			String SecondBestprogramming = topProgrammingLanguages.get(2);
			System.out.println("Second Best programming Language  => "+SecondBestprogramming);

			//Modify the element  at a particular index using set() Method
			topProgrammingLanguages.set(4, "C#");
			System.out.println(topProgrammingLanguages);
		}
}
