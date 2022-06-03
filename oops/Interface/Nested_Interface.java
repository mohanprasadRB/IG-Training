package com.java.oops.Interface;


public class Nested_Interface {
	 
	interface myInterface {
	      void demo();
	   }
	   
	class Inner implements myInterface {
	      public void demo() {
	         System.out.println("Welcome to Tutorialspoint");
	      }
	   }
	   public static void main(String args[]) {
	      Inner obj = new Nested_Interface().new Inner();
	      obj.demo();
	   }
	}
