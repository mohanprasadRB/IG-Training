package com.java.LambdaExpression;

interface Sayable {
	public String say();
}

public class Lambda_Exp_With_No_Parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sayable s = ()-> "I have Something";
		System.out.println(s.say());

	}
}
