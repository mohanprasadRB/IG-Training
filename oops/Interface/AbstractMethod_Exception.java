package com.java.oops.Interface;

abstract class base
{
	abstract void sum() throws Exception;
	 
}

interface i3
{
	void sub() throws Exception;
	
	void mul() throws ArithmeticException;
}
public class AbstractMethod_Exception extends base implements i3{
	
	 public static void main(String[] args)    {
		
		 AbstractMethod_Exception obj = new AbstractMethod_Exception();
		// obj.sum();
		 obj.callingmethod(); 
		 obj.sub();
	}
 
	void callingmethod() 
	{
		 System.out.println("Function caller");
		 sum();
		
	}

	@Override
	public void sum()  {
		// TODO Auto-generated method stub
		 
	//	System.out.println("Devide by zero"+1/0);
			// TODO: handle exception
 		}

	@Override
	public void sub()  {
		// TODO Auto-generated method stub
		System.out.println(1/0);
		
	}

	@Override
	public void mul() throws ArithmeticException {
		// TODO Auto-generated method stub
		System.out.println("Multiplication function");
		
	}
	
}
