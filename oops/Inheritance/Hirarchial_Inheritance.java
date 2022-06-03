package com.java.oops.Inheritance;

class super6
{
	
	static
	{
		System.out.println("static block 1");
	}
	
	{
		System.out.println("instance block 1");
	}
	
	static void display1()
	{
		System.out.println("static method");
	}
	super6()
	{
		System.out.println("constructor 1");
	}
	void display() {
		System.out.println("display");
	}
	
	Object  get()
	{
		return null;
		 
		
	}
}
	
	class child6 extends super6 {
		
		static {
			System.out.println("static block 2");
		}
		{
			System.out.println("instance block 2");
		}
		void display()
		{
			
			super.display1();
			System.out.println("over ride method");
		}
		child6()
		{
			System.out.println("constructor 2");
		}
	}
	
	class child7 extends child6 {
		static 
		{
			System.out.println("static block 3");
		}
		
		{
			System.out.println("instance block 3");
		}
		
		child7() {
			System.out.println("constructor 3");
		}
	}

public class Hirarchial_Inheritance {

	public static void main(String[] args) {

	child7 obj1 = new child7();
	obj1.display();
	
	child6 obj2 = new child6();
	obj2.display();
	obj2.display();

}
}