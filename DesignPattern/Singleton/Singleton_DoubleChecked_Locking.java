package com.java.DesignPattern.Singleton;

class SingletonDemo2 {
	
	private SingletonDemo2() {
		System.out.println("Instance Created");
	}
	
	private static   SingletonDemo2 obj;
	
	public static SingletonDemo2 getInstance()
	{
		 if(obj==null)
		 {
			 synchronized (SingletonDemo2.class) 
			 {
				 if(obj==null)
					 obj = new SingletonDemo2();
			 }
		 }
		 return obj;
	} 
}

public class Singleton_DoubleChecked_Locking {

public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
 				
				SingletonDemo2 obj = SingletonDemo2.getInstance();
				System.out.println(obj.hashCode());
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
 				
				SingletonDemo2 obj = SingletonDemo2.getInstance();
				System.out.println(obj.hashCode());
			}
		});
		
		t1.start();
		t2.start();
	}

}
