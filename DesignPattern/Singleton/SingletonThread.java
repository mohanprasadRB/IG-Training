package com.java.DesignPattern.Singleton;

class SingletonDemo {
	
	private SingletonDemo() {
		System.out.println("Constructor Called");
	}
	
	private static   SingletonDemo obj;
	
	public static  SingletonDemo getInstance()
	{
		 if(obj==null)
			 obj = new SingletonDemo();
		 return obj;
	} 
}


public class SingletonThread {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
 				
				SingletonDemo obj = SingletonDemo.getInstance();
				System.out.println(obj.hashCode());
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
 				
				SingletonDemo obj = SingletonDemo.getInstance();
				System.out.println(obj.hashCode());
			}
		});
		
		t1.start();
		t2.start();
	}

}
