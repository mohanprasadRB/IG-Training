package com.java.Streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Stream_IntSummaryStatics {

	public static void main(String[] args) {
		
		 List<Integer> ilist = Arrays.asList(10,10,20,30,30,40,40);
		 IntSummaryStatistics stats = ilist.stream().mapToInt(x -> x).summaryStatistics();
		 System.out.println(stats.getCount());
		 System.out.println(stats.getAverage());
		 System.out.println(stats.getMax());
		 System.out.println(stats.getMin());
		 System.out.println(stats.getSum());
	}
}
