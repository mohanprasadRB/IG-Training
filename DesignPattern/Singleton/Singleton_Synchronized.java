package com.java.DesignPattern.Singleton;

class SingletonDemo1 {
	
	private SingletonDemo1() {
		System.out.println("Instance Created");
	}
	
	private static   SingletonDemo1 obj;
	
	public synchronized static   SingletonDemo1 getInstance()
	{
		 if(obj==null)
			 obj = new SingletonDemo1();
		 return obj;
	} 
}


public class Singleton_Synchronized {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
 				
				SingletonDemo1 obj = SingletonDemo1.getInstance();
				System.out.println(obj.hashCode());
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
 				
				SingletonDemo1 obj = SingletonDemo1.getInstance();
				System.out.println(obj.hashCode());
			}
		});
		
		t1.start();
	
		t2.start();
	}

}

