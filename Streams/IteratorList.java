package com.java.Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorList {
	
	public static int sum(List<Integer> list)
	{
//		int sum=0;
//		Iterator<Integer> itr = list.iterator();
//		while(itr.hasNext())
//		{
//			sum=sum+itr.next();
//		}
//		
//		System.out.println(sum);
//		return sum;
		
		//Using Lambda Expression
		return list.stream().filter(i->i>=10).mapToInt(i->i).sum();
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,40);
		System.out.println(sum(list));
	}

}
