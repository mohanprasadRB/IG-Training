package com.java.oops.Abstraction;

abstract class a1 {
	
	abstract void disply();
}

abstract class a2 extends a1 {
	abstract void print();
}

abstract class a3 extends a2 {
	abstract void show();
}

class a4 extends a3
{
	
	void classmethod()
	
	{
		System.out.println("Abstract class method");
	}

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("class a3 method");
		
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("Abstract Class a2 method");

		
	}

	@Override
	void disply() {
		// TODO Auto-generated method stub
		System.out.println("Abstract Class a1 method");
		
	}
	
}
public class Abstract_Class_Extends_Abstract_Class {
	
	public static void main(String[] args) {
		 
		a4 obj = new a4();
		obj.disply();
		obj.print();
		obj.show();
		obj.classmethod();
	}

}
