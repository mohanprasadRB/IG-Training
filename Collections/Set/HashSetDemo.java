package com.java.Collections.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class HashSetDemo {

	public static void main(String[] args) {

		duplicateValuesDemo();
		nullValueDemo();
		unorderedDemo();
	}

	public static void duplicateValuesDemo() {
		Set<String> set = new HashSet<String>();
		set.add("element1");
		set.add("element2");
		set.add("element1");

		System.out.println(set);
	}

	public static void nullValueDemo() {
		Set<String> set = new HashSet<String>();
		set.add(null);
		set.add(null);
		System.out.println(set);
	}
	
	public  static void unorderedDemo()
	{
		Set<String> set = new HashSet<String>();
		set.add("element1");
		set.add("element2");
		set.add("element3");
		set.add("element7");
		set.add("element4");
		set.add("element5");
		set.add("element6");
		
		System.out.println(set);
		set.parallelStream().forEach(s->System.out.print(" "+s));
		
	}
}
