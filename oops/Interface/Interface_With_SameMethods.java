package com.java.oops.Interface;

interface i1
{
	void display();
	
}

interface i2 {
	
	void display();
}


public class Interface_With_SameMethods implements i1,i2 {

	public static void main(String[] args)
	{
		Interface_With_SameMethods obj = new Interface_With_SameMethods();
		 
		System.out.println("hello");
		obj.display();
		i1 obj1 = new Interface_With_SameMethods();
		obj1.display();
		i2 obj2 =  new Interface_With_SameMethods();

	}
	
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
}

