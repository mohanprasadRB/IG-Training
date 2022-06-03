package com.java.oops.Inheritance;
class parent1 {
	
	parent1()
	{
		System.out.println("Parent constructor  ");
	
	}
}

class child1 extends parent1
{
	child1(){
		System.out.println("Child constructor  ");
	}
}
public class Constructor_calling_Bydefault {
	
	public static void main(String[] args) {
		
		child1 obj = new child1();
		
	}
	

}
