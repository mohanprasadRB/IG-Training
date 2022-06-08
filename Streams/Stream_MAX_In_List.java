package com.java.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Stream_MAX_In_List {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		Integer sum= list.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sum);
		
		
	}

}
