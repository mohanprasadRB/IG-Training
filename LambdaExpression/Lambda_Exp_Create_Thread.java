package com.java.LambdaExpression;

public class Lambda_Exp_Create_Thread {
	public static void main(String[] args) {
		
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Runnable method");
				
			}
		};
		
		r2.run();
		
		Runnable r = () -> {
			
			for(int i=0;i<1;i++)
				System.out.println("LamdaExpression");
		};
		
		r.run();
		Thread t = new Thread(r);
		t.start();
	}

}
