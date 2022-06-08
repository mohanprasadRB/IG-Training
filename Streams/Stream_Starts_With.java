package com.java.Streams;

import java.util.Arrays;
import java.util.List;

public class Stream_Starts_With {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Mohan","Prasad","RB","UVCE","Bangalore","University");

		System.out.println(list.stream().filter(p->p.startsWith("R")).count());
		
		List<Integer> ilist = Arrays.asList(10,20,30,40,50,10,20,30);
			ilist.stream().sorted((Integer o1, Integer o2)-> {return o1>o2?-1: o1<o2?1:0;}).forEach(System.out::print);
 
			ilist.stream().distinct().forEach(s->System.out.println(s));
		
 	}
}
