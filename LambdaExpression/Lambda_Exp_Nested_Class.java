package com.java.LambdaExpression;

interface Print {
	void print(String x);
 
}


public class Lambda_Exp_Nested_Class 
{
	public static void main(String[] args)
	{
		Print myprint = new Print() {
			
			 
			@Override
			public void print(String x) {
			System.out.println(x);	
			}
		};
		
		
		myprint.print("Mohan");
		
		Print p =(a)->System.out.println(a);
		p.print("hello Mohan");
		
	}

}
