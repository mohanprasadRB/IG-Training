package com.java.oops.DesignPattern.BreakSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class LazySingleton3 extends MyClone
{
	private LazySingleton3()
	{
		
	}
	
	private static LazySingleton3 instance;
	
	public static synchronized LazySingleton3 getInstance()
	{
		if(instance == null)
			return instance = new LazySingleton3();
	else
	{
		return  instance;
	}
}
}

public class Reflection {
	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		LazySingleton3 instance1 = LazySingleton3.getInstance();
		System.out.println(instance1.hashCode());
		
		LazySingleton3 reflectioInstance = null;
		
		 Constructor[] constructors = LazySingleton3.class.getDeclaredConstructors();
		 for(Constructor constructor : constructors)
		 {
			 constructor.setAccessible(true);
		 reflectioInstance = (LazySingleton3) constructor.newInstance();
		 }
		 
		 System.out.println(reflectioInstance.hashCode());
		 
		
		
		
	}
	 
} 