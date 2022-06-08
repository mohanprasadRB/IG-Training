package com.java.Streams;

import java.util.Arrays;
import java.util.List;

public class Stream_Empty_String {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList(" "," "," "," ");
		System.out.println(		list.stream().filter(p->p==" ").count());
	}

}
