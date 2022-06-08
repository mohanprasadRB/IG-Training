package com.java.Streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Sqr_Distinct_Number {
	
	public static void main(String[] args) {
		

		 List<Integer> ilist = Arrays.asList(10,10,20,30,30,40,40);
		 ilist.stream().distinct().map(m->m*m).forEach(s->System.out.print(s+" "));
		 
		 List<Integer> newlist = ilist.stream().distinct().map(m->m*m).collect(Collectors.toList());
		 System.out.println(newlist);
		 
		  
		 
		  
	}

}
