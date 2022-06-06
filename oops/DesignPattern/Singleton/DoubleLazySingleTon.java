package com.java.oops.DesignPattern.Singleton;

class  doublelazy {
	
	private doublelazy ()  {
		
	}
	
	private static doublelazy instance;
	
	public static doublelazy getinstance()
	{
		if(instance==null) {
			synchronized (doublelazy.class) {
				if (instance==null) 
					instance=new doublelazy();
			} 
		}return instance;
	}	
}
public class DoubleLazySingleTon {
	
	public static void main(String[] args) {
		
		doublelazy obj1 = doublelazy.getinstance();
		doublelazy obj2 = doublelazy.getinstance();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}
