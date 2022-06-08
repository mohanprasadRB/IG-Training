package com.java.Streams;

import java.util.stream.Stream;

public class Stream_StreamOf {

	public static void main(String[] args) {
		
		Stream.of("Mohan","Prasad","RB","UVCE")
		.findFirst().ifPresent(s->System.out.println(s));
		

		Stream.of("Mohan","Prasad","RB","UVCE")
		.findFirst().ifPresent(System.out::println);
	}
}
