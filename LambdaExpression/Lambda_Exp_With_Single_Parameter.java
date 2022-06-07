package com.java.LambdaExpression;

interface Sayable1
{
	public String say(String name);
}
public class Lambda_Exp_With_Single_Parameter {
	
	public static void main(String[] args) {
		
		
		Sayable1 s1 = (name)->  "Hello "+name;
		System.out.println(s1.say("Mohan"));
	}

}
