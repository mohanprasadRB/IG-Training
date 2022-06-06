package com.java.oops.polymorphism.Static;

class Human{
	   public static void walk()
	   {
	       System.out.println("Human walks");
	   }
	   
	   String displaymethod(String s) {
		    return "Called by"+s;
	   }
	}
	class Boy extends Human{
	   public static void walk(){
	       System.out.println("Boy walks");
	   }
	   
	   static void display()
	   {
		   System.out.println("Child method");
	   }
	   
	}
	
	class Static_Binding {
		
		public static void main(String[] args) {
			
			  /* Reference is of Human type and object is
		        * Boy type
		        */
		       Human obj = new Boy();
		       /* Reference is of HUman type and object is
		        * of Human type.
		        */
		       Human obj2 = new Human();
		       obj.walk();
		       obj2.walk();
		        
		       Boy obj3 = new Boy();
		       obj3.display();
		       
		     System.out.println(obj3.displaymethod(" Child class refference"));
		     System.out.println( obj2.displaymethod(" Baase class refference"));
			
		}
	}
