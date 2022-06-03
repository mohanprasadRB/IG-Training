package com.java.oops.Inheritance;
class super5 {
	private String oload()
	{
		System.out.println("super oloadmethod");
		return null;
	}
	
	public void oload2() {
		System.out.println("Public Method oload2");
	}
}
public class PrivateMethodOverload extends super5 {
	
	
	private String oload()
	{
		
		super.oload2();
		System.out.println("Private Overload");
		return null;
	}
	
	final String oload(int q)
	{
		
		System.out.println("Final over load method");
		return null;
		
	}
	
	public static void main(String[] args) {
		PrivateMethodOverload obj = new PrivateMethodOverload();
		obj.oload();
		obj.oload(10);
	}

}
