package com.java.Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Streams_StartsWith {
	public static void main(String[] args) {
		
		List<String> Mylist = Arrays.asList("Moahn","RB","UVCE","Bangalore","KR Circle");
		Mylist.stream().findFirst().ifPresent(System.out::println);	
		Mylist.stream().filter(p->p.length()>5).forEach(s->System.out.println("String length > 5 "+s));	
		
		
		
		
		Mylist.stream().filter(p->p.startsWith("R")).forEach(s->System.out.println(s));
		
		Mylist.stream().filter(p->p.startsWith("K")).
		forEach(s->System.out.println(s));;
		
		List<Integer> list =Arrays.asList(10,20,30,40,50,15,25,35,45,55,1,2,3,4,5);
		list.stream().filter(p->(p%2!=0)).forEach(a->System.out.print(" "+a));
		
		System.out.println();
		Mylist.stream().filter(p->p.startsWith("M")).map(String::toUpperCase).forEach(s->System.out.print(s+" Starts with Name M"));;
		
		System.out.println();
		list.stream().findFirst().ifPresent(s->System.out.println(s));;
		
		Stream.of("Mohan","Prasad","RB","UVCE","Bangalore").findFirst().
									ifPresent(c->System.out.println(c));;
									
		Stream.of(1,3,5,7,9,10,20,30,40,50,1,23,4,10,20,30,40).filter(p->p%2!=0).forEach(a->System.out.print(a+" "));
		
		Set<Integer> list2 = new TreeSet<Integer>();
		
		Iterator<Integer> it = list.iterator();
		
		System.out.println();
		System.out.println(list2);
	
	}
	
	
}
