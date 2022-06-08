package com.java.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stream_Sort {
	
	public static void main(String[] args) {
		
		
		Comparator<Integer> c = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1>o2?-1: o1<o2?1:0;
			}
		};
		List<Integer> list = Arrays.asList(100,50,200,1000,10,20,30,40);
		list.stream().sorted().forEach(s->System.out.print(s+" "));
		System.out.println();
		list.stream().sorted(c).forEach(s->System.out.print(s+" "));
	}

}
