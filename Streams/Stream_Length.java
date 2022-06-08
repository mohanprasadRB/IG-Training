package com.java.Streams;

import java.util.Arrays;
import java.util.List;

public class Stream_Length {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Mohan","Prasad","RB","UVCE","Bangalore","University");
		list.stream().filter(p->p.length()>3).forEach(s->System.out.println(s));
		
		
	}

}
