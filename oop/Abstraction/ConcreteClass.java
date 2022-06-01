package com.java.oop.Abstraction;

abstract class AbstractClass {
    public AbstractClass() {
        System.out.print("Initializing AbstractClass \t");
    }
}

 class ConcreteClassA extends AbstractClass {
	public ConcreteClassA()
	{
		System.out.println("initializing ConcreteClass A");
	}
	
}

 class ConcreteClassB extends AbstractClass {
    public ConcreteClassB() {
        System.out.println("Initializing ConcreteClass B");
    }
 }
   public class ConcreteClass
   {
	   public static void main(String[] args) {
		   
		   ConcreteClassA Aobj = new ConcreteClassA();
		   ConcreteClassB Bobj = new ConcreteClassB();

	}
   }
