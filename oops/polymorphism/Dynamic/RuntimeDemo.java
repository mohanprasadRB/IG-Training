package com.java.oops.polymorphism.Dynamic;

class Animal{
	
	   public void sound(){
	      System.out.println("Animal is making a sound");   
	   }
	}

 class Horse extends Animal{
    @Override
    public void sound(){
        System.out.println("Neigh");
    }
}
 
 class Cat extends Animal{
	 
	     @Override
	     public void sound(){
	         System.out.println("Meow");
	     }
	 }
 
public class RuntimeDemo {
	
	public static void main(String[] args) {
		
		Animal obj = new Cat();
		obj.sound();
		
		Animal obj2 = new Horse();
		obj2.sound();
	}
	

}
