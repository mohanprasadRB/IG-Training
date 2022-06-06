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

class LazySingleton6 extends MyClone implements Serializable
{
	private static LazySingleton6 instance;
	private LazySingleton6()
	{
		
	}
	
		protected Object readResolve()
		{
			return instance;
		}
		
		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
	
	public static synchronized LazySingleton6 getInstance()
	{
		if(instance == null)
			return instance = new LazySingleton6();
	else
	{
		return  instance;
	}
}
}

public class Prevent_From_Serialize {
	public static void main(String[] args) throws CloneNotSupportedException, FileNotFoundException, IOException, ClassNotFoundException {
		
		LazySingleton6 instance1 = LazySingleton6.getInstance();
		//System.out.println(instance1.hashCode());
		 

		//serialize singletonobject to a file
		
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
		out.writeObject(instance1);
		out.close();
		
		ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
		LazySingleton6 instance2 = (LazySingleton6) in.readObject();
		in.close();
		
		System.out.println("instance1 hashCode "+instance1.hashCode() );
		System.out.println("instance2 hashCode "+instance2.hashCode() );

		
		
	}
	 
}
 