package com.java.oops.Inheritance;

class Type_Promotion{
	   void disp(int a, double b)
	   {
		System.out.println("Method A");
	   }
	   
	   void disp(int a, double b, double c)
	   {
		System.out.println("Method B");
	   }
	   
	   void disp(int a, float b)
	   {
		System.out.println("Method C");
	   }
	   
	   public static void main(String args[]){
		   Type_Promotion obj = new Type_Promotion();
		
		
	    obj.disp(100, 20.67f);
		obj.disp(100, 20.67);
	   }
	}