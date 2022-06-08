package com.java.Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Duplicate_Elements {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,40,50,10,20,30,40);
		
		Stream<Integer> s = list.stream();
		System.out.println(findDuplicateInStream(s));	
 	
	}
	public static <T> Set<T>
    findDuplicateInStream(Stream<T> stream)
    {
  
         Set<T> items = new HashSet<>();
        return stream.filter(n->!items.add(n)).collect(Collectors.toSet());
    }

}
