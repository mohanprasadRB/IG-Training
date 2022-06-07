package com.java.LambdaExpression;

interface Addition1
{
	int add(int a, int b);
}
public class Lambda_Exp_With_Returntype {

	public static void main(String[] args) {
		
		Addition1 a1 = (a,b)->{ return  a+b;};
		System.out.println(a1.add(10, 20));
		
	}
}
