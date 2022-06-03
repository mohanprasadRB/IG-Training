package com.java.oops.Inheritance;

class CarClass
{
	
	CarClass() {
		System.out.println("parent constructor");
	}
    public int speedLimit() 
    {
        return 100;
    }
}
class Single_Inheritance extends CarClass {
	
	Single_Inheritance() {
		System.out.println("Child constructors");
	}
    public int speedLimit()
    {
        return 150;
    }
    public static void main(String args[])
    {
    	CarClass obj = new Single_Inheritance();
    	int num= obj.speedLimit();
    	System.out.println("Speed Limit is: "+num);
    	
    	CarClass obj2 = new CarClass();
    	Single_Inheritance obj3 = new Single_Inheritance();
    	
    }
}