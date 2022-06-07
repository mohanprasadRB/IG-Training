package com.java.LambdaExpression;

interface Sayable2 
{
	
	public String say(String name);
}

interface Addable 
{
	int add(int a, int b);
}

public class Lambda_Exp_With_Multiple_Parameter {
	
	public static void main(String[] args) {
		
		Addable a1 = (a,b)->(a+b);
		System.out.println(a1.add(10,20));
		
	}

}
