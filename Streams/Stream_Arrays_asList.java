package com.java.Streams;

import java.util.Arrays;
public class Stream_Arrays_asList {
	
	public static void main(String[] args) 
	{
	   Arrays.asList("Mohan","Prasad","RB")
	   				.stream()
	   				.findFirst()
	   				.ifPresent(s->System.out.println(s));
	
	}

}
