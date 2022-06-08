package com.java.Streams;

import java.util.Arrays;
import java.util.List;

public class Stream_Elements_In_List {
	
	public static void main(String[] args) {
		
		List< Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		System.out.println(	list.stream().count());

	}

}
