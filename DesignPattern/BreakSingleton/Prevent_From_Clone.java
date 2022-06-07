package com.java.DesignPattern.BreakSingleton;

class LazySingleton1 extends MyClone
{
	private LazySingleton1()
	{
		
	}
	
	private static LazySingleton1 instance;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		 throw new CloneNotSupportedException();
	}
	
	public static synchronized LazySingleton1 getInstance()
	{
		if(instance == null)
			return instance = new LazySingleton1();
	else
	{
		return  instance;
	}
}
}

public class Prevent_From_Clone {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		LazySingleton1 instance1 = LazySingleton1.getInstance();
	
		System.out.println(instance1.hashCode());
		
		LazySingleton1 instance2 = (LazySingleton1) instance1.clone();
		
		
		System.out.println(instance2.hashCode());
	} 
}
