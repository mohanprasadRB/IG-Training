package com.java.DesignPattern.Singleton;

enum SingletonEnum
{
	INSTANCE;
	int i;
	
	void show()
	{
		System.out.println(i);
	}
}
public class Singleton_Using_Enum {
	
	public static void main(String[] args) {
		
		SingletonEnum obj1 = SingletonEnum.INSTANCE;
		obj1.i = 5;
		obj1.show();
		
		SingletonEnum obj2 = SingletonEnum.INSTANCE;
		obj2.i = 6;
		obj2.show();
		
		
	}

}
