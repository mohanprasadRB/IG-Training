package com.java.oops.DesignPattern.Singleton;

class LazyInnerClassSingleTon {
	
	private  LazyInnerClassSingleTon() 
	{
		
	}
	
	private static class SingleTonHelper {
		private static final LazyInnerClassSingleTon instance = new LazyInnerClassSingleTon();
	}
	
	public static LazyInnerClassSingleTon getInstance() {
		return SingleTonHelper.instance;
		
	}
}
	class lazy
	{
	
	private lazy()
	{
		}
	
	private static lazy instance;
	
	public static synchronized lazy getinstance()
	{
		if(instance==null)
		return	instance=new lazy();
		else
			return instance;
		  
	}
}
	public class LazySingleTon 
	{
	public static void main(String[] args) {
		
		lazy obj1 = lazy.getinstance();
		lazy obj2 = lazy.getinstance();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}
