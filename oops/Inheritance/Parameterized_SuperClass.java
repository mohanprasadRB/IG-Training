package com.java.oops.Inheritance;

class superclass2  {
	
	public superclass2() {
		// TODO Auto-generated constructor stub
		System.out.println(" No arg super");
	}
	superclass2(String s) {
		
		System.out.println("Super class constructor with arg");
	}
}
class childclass2 extends superclass2 {
	
	public childclass2() {
		// TODO Auto-generated constructor stub
	//	super();           // if parameter is not passed to the superclassconstructor the noarg will call automatically
		super("Mohan");		// if the super key word is not mentioned then also the supeclass constructor will automatically invoke first
		System.out.println("child class constructor noarg");
		 
	}
	
}
public class Parameterized_SuperClass {
	
	public static void main(String[] args) {
		
		childclass2 cobj = new childclass2();
		
	}

}
