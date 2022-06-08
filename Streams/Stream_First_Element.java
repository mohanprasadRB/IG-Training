package com.java.Streams;

import java.util.Arrays;
import java.util.List;

public class Stream_First_Element {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		list.stream().findFirst().ifPresent(s->System.out.println(s));
		
	}

}
