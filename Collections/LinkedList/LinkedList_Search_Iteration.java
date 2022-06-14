package com.java.Collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

 
public class LinkedList_Search_Iteration {

	public static void main(String[] args) {

		LinkedList<String> progLangs = new LinkedList<String>();
		progLangs.add("C");
		progLangs.add("C++");
		progLangs.add("Core-Java");
		progLangs.add("Core-Java");
		progLangs.add("J2ee");
		progLangs.add("Spring Framework");
		progLangs.add("Hibernate Framework");
		progLangs.add("Core-Java");

		boolean result = progLangs.contains("C");
		System.out.println(result);

		int index = progLangs.indexOf("Core-Java");
		System.out.println(index);

		int lastindex = progLangs.lastIndexOf("Core-Java");
		System.out.println(lastindex);

		// Iterator
		Iterator<String> itr = progLangs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		for(Iterator<String> itr2=progLangs.iterator();itr2.hasNext();)
			System.out.println(itr2.next());
		
		for (String string : progLangs) {
			System.out.println(string);
			
		//forEach Method
			progLangs.forEach(s->System.out.println(s));
			
		}

	}

}
