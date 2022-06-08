package com.java.Streams;

import java.util.Arrays;
import java.util.List;

public class Stream_toLowerCase {
	 
public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Mohan","RB","UVCE","Bangalore");
		
		list.stream().filter(p->p.startsWith("M")).
		map(m->m.toLowerCase()).forEach(s->System.out.println(s));
		
		//list.stream().map(m->m.toUpperCase()).forEach(System.out::println);
		list.stream().map(m->m.toLowerCase()).forEach(s->System.out.print(s+" "));
			
		
		System.out.println();
		System.out.println("Sorted Order");
		list.stream().map(m->m.toUpperCase()).sorted().forEach(s->System.out.print(s+" "));
	}
}
