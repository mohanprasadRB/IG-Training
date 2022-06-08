package com.java.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class Stream_Split_Iterator {
	
	public static void main(String[] args) {
		
		List<String> names =Arrays.asList("Mohan","Prasad","RB","UVCE");
		Spliterator<String> nameSpliterator = names.spliterator();
		
		nameSpliterator.forEachRemaining(s->System.out.println(s));
	}

}
