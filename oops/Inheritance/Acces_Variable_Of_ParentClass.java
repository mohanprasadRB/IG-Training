package com.java.oops.Inheritance;
class superclass { 
	
	int var =100;
}

class childclass extends superclass{ 
	int  var =10;
	void display() {
		System.out.println(super.var);

		super.var=200;
		System.out.println(super.var);
	}
}
public class Acces_Variable_Of_ParentClass {

	public static void main(String[] args) {
		childclass cobj = new childclass();
		cobj.var=100;
		cobj.display();		 
	}
}
