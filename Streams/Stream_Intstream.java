package com.java.Streams;

import java.util.stream.IntStream;

public class Stream_Intstream {
	
	public static void main(String[] args) {
		
		IntStream.range( 1000,1010).forEach(s->System.out.print(" "+s));
	}

}
