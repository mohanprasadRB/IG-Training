package com.java.oop.Abstraction;

abstract class Content {
	int a;
	
	public Content(int a) {
		this.a = a;  
		}
	
abstract int multiply(int val);
}


class subclass extends Content {
	
	public subclass() {
		super(2);
	}

	// Defining method the abstract method
	public int multiply(int val)
	{
		return this.a * val;
	}
}


public class InitializeAbstractClassVariable {

	public static void main(String args[])
	{
		Content c = new subclass();

		System.out.println(c.multiply(3));
	}
}

