package com.java.DesignPattern.BreakSingleton;

class LazySingleton extends MyClone
{
	private LazySingleton()
	{
		
	}
	
	private static LazySingleton instance;
	
	public static synchronized LazySingleton getInstance()
	{
		if(instance == null)
			return instance = new LazySingleton();
	else
	{
		return  instance;
	}
}
}

public class Clone {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		LazySingleton instance1 = LazySingleton.getInstance();
		
		LazySingleton instance2 = (LazySingleton) instance1.clone();
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());

		
		
	}
	 
}