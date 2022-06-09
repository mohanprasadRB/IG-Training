package com.java.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_FlatMap2 {

	public static void main(String[] args) {
		 
		List<Integer> even = Arrays.asList(2,4,6,8,10);
		List<Integer>odd = Arrays.asList(3,5,7,9);
		List<Integer>prime = Arrays.asList(2,4,6,8);
		
		List<List<Integer>> intlist = Arrays.asList(even,odd,prime);
		
		System.out.println(intlist);
		
		intlist.stream().flatMap(list-> list.stream()).forEach(s->System.out.print(" "+s));
	}
}
