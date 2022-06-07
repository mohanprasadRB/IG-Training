package com.java.LambdaExpression;

interface Sayable3
{
	String say(String say);
	
}
public class Lambda_Exp_Multiple_Statements {

	public static void main(String[] args) {
 
		Sayable3 person = (message)-> {
			
			String str1 = "I would like to say, ";
			String str2 = str1 + message;
			return str2;
		};
		
		System.out.println(person.say("Time is precious"));
	}

}
