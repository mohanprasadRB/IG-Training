package com.java.LambdaExpression;

import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda1 {
	
	public static void main(String[] args) {
		
		 Greeting g = () -> System.out.println("Hello am lambda");
		 g.Perform();
	 
		 	g.add(10, 20);
		 	
		 	Function<Integer, Integer> f = a ->  a*a; 
		 	int mul =f.apply(10);
		 	System.out.println(mul);
		 	
		 	Predicate<Integer> p = (a)-> a>10;
		 	System.out.println(p.test(10));
		 	
		 	
		 	 Runnable r = () -> {for(int i=0;i<10;i++)System.out.println("Hello");};
		 	 Thread t = new Thread(r);
		 	 t.start();
		 
		 	 
		 	 Function<String, Integer> f2 = s ->  s.length();
		 	 System.out.println(f2.apply("MOHAN"));
		 	 
		 	 
		 	 leng l1= s->s.length() > 10;
		 	 System.out.println(l1.len("MOHAN"));
		 	 
		 	 
			 leng1 l2= s2->s2.length();
		 	 System.out.println(l2.len("MOHAN"));
		 	 
		 	 
		 	 
	}

}
