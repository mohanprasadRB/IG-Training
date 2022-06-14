package com.java.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	
	public static void main(String[] args) {
		
		Collection<String> fruitCollection = new ArrayList<String>();
		fruitCollection.add("banana");
		fruitCollection.add("apple");
		fruitCollection.add("mango");
		System.out.println(fruitCollection);
		fruitCollection.remove("banana");
		System.out.println(fruitCollection);
		boolean b=fruitCollection.contains("apple");
		System.out.println(b);
		
		b=fruitCollection.isEmpty();
		System.out.println(b);
		
		fruitCollection.forEach((e)-> { System.out.println(e);});
		
		Collection<String> newfruitlist = new  ArrayList<String>();
		newfruitlist.add("Cherry");
		
		System.out.println(fruitCollection);
		b=fruitCollection.containsAll(newfruitlist);
		System.out.println(b);
		System.out.println(newfruitlist);
		System.out.println(fruitCollection);
		fruitCollection.addAll(newfruitlist);
		b=fruitCollection.containsAll(newfruitlist);
		System.out.println(b);
		System.out.println(fruitCollection);
		
		 
		String s ="mohan Prasad RB";
		for(int i=s.length()-1;i>=0;i--) {
		System.out.println(s.charAt(i));
		}	 
	}

}
