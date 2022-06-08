package com.java.Streams;

import java.util.Arrays;
import java.util.List;

public class Stream_Starts_with1 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,40,50,90,80,70,60,5,15,25,35,45,55);
		System.out.println(list);
		System.out.println("List of Prime Numbers");
		list.stream().filter(p->p%2==0).forEach(s->System.out.print(s+" "));
		
		System.out.println();
		System.out.println("List of Numbers starts with 1");
		list.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(s->System.out.print(s+" "));
		
		String[] s= new String[list.size()-1];
		
		for(int i=0; i<list.size()-1;i++)
		{
			s[i]= String.valueOf(list.get(i));
		}
		
		System.out.println();
		 for(int i=0;i<list.size()-1;i++)
		 {
			 if(s[i].startsWith("1"))
			 {
				 System.out.print(s[i]+" ");
				 
			 }
		 } 
	}
}
