package com.java.LambdaExpression;

interface Greeting {
	public void Perform();
	
	 

	default public void add(int a, int b) {
		System.out.println(a+b);
	}
}

interface leng
{
public	boolean len(String s);
}

interface leng1
{
public	int len(String s);
}

interface ccat
{
	public String ccat(String s1);
}


class HelloWorldGreeting implements Greeting {

	@Override
	public void Perform() {
		 System.out.println("Hello world");	
	}
	
}
public class Greeter {
	
	public void greet(Greeting greeting)
	{
		greeting.Perform();
	}
	public static void main(String[] args) {
		
		Greeter greeter = new Greeter();
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
		
		
	}

}
