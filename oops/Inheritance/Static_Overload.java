package com.java.oops.Inheritance;

public class Static_Overload {

	static void  m1()
	{
		System.out.println("static method over load");
	}
	
	static String m1(int a)
	{
		
		System.out.println("Method called "+a);
		return "Same method name with String return type";
	}
	
	public static void main(String[] args) {
		m1();
		m1(10);
		System.out.println(m1(10));
	}
}
