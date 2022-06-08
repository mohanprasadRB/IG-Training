package com.java.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Parallel_Strem {

	public static void main(String[] args) {
 
			List<Integer> list = Arrays.asList(100,200,1,2,3,4,5,6,7,8,9,10);
			List<Integer> result = new ArrayList<Integer>();
			
			Stream<Integer> stream = list.parallelStream();
			
			stream.map(val -> { 
						synchronized (result) {
							if(result.size() < 12 ) {
								result.add(val);
							}
						}
						
						return val;}).forEach(e -> {});
			System.out.println(result);
			
			
			list.parallelStream().sorted().forEach(s->System.out.print(s+" "));
			System.out.println();
			list.stream().sorted().forEach(s->System.out.print(s+" "));
	 
			
		
	}

}
