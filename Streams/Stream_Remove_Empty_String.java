package com.java.Streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Stream_Remove_Empty_String {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(Arrays.asList("Mohan","RB","UVCE","", ""));
		System.out.println(list);
		
		  list.removeIf(String::isEmpty);
		  System.out.println(list);
			
		}
	}


