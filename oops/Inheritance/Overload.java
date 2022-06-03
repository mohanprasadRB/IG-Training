package com.java.oops.Inheritance;
class a
{
	void display()
	{
		System.out.println(" Base class display");
	}
	
	int display(int i)
	{
		System.out.println("Over load");
		return 0;
	}
}

public class Overload extends a {
	
	void display()
	{
	System.out.println(" Child class over rides Base calss display method");
	}
	
	int display(int i)
	{
		System.out.println("Child class Over rides Base Class method");
		return i;
	}
	  
	public static void main(String[] args) {
		
		a obj = new Overload();
		obj.display();
		
		Overload obj1 = new Overload();
		obj1.display();
		
		a obj2 = new a();
		obj2.display();
		
		System.out.println(obj.display(10));
	}
}
