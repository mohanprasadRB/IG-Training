package com.java.oops.DesignPattern.BreakSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class LazySingleton4 extends MyClone
{
	private LazySingleton4()
	{
		if(instance!=null)
			throw new IllegalStateException("Object cant create using reflection");
		
	}
	
	private static LazySingleton4 instance;
	
	public static synchronized LazySingleton4 getInstance()
	{
		if(instance == null)
			return instance = new LazySingleton4();
	else
	{
		return  instance;
	}
}
}

public class Prevent_From_Reflection {
	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		LazySingleton4 instance1 = LazySingleton4.getInstance();
		System.out.println(instance1.hashCode());
		
		LazySingleton4 reflectioInstance = null;
		
		 Constructor[] constructors = LazySingleton4.class.getDeclaredConstructors();
		 for(Constructor constructor : constructors)
		 {
			 constructor.setAccessible(true);
		 reflectioInstance = (LazySingleton4) constructor.newInstance();
		 }
		 
		 System.out.println(reflectioInstance.hashCode());
		 
		
		
		
	}
	 
}  
