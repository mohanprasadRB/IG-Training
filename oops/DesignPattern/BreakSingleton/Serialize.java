package com.java.oops.DesignPattern.BreakSingleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class LazySingleton5 extends MyClone implements Serializable
{
	private LazySingleton5()
	{
		
	}
	
	private static LazySingleton5 instance;
	
	public static synchronized LazySingleton5 getInstance()
	{
		if(instance == null)
			return instance = new LazySingleton5();
	else
	{
		return  instance;
	}
}
}

public class Serialize {
	public static void main(String[] args) throws CloneNotSupportedException, FileNotFoundException, IOException, ClassNotFoundException {
		
		LazySingleton5 instance1 = LazySingleton5.getInstance();
		//System.out.println(instance1.hashCode());
		 

		//serialize singletonobject to a file
		
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
		out.writeObject(instance1);
		out.close();
		
		ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
		LazySingleton5 instance2 = (LazySingleton5) in.readObject();
		in.close();
		
		System.out.println("instance1 hashCode "+instance1.hashCode() );
		System.out.println("instance2 hashCode "+instance2.hashCode() );

		
		
	}
	 
}
 