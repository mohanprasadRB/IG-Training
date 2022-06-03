package com.java.oops.Inheritance;

class  super1 {
	
	void display()
	{
		System.out.println("Super class dispaly");
	}
}

class child2 extends super1 {
	
	void display() {
		
		super.display();
		System.out.println("Child display");
	}
}

public class Overriding_SuperClass_Method {
	
	public static void main(String[] args) {
		
		child2 cobj = new child2();
		cobj.display();
		super1 sobj = new super1();
		sobj.display();
		
		
		
	}

}
