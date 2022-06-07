package com.java.DesignPattern.Factory;

interface OS
{
	void spec();
}

class Android implements OS {

	@Override
	public void spec()
	{
		// TODO Auto-generated method stub
		
		System.out.println("Android");	
	}
}

class IOS implements OS {
	@Override
	public void spec() {
		// TODO Auto-generated method stub
		System.out.println("IOS");
	}	
}

class Windows implements OS {

	@Override
	public void spec() {
		// TODO Auto-generated method stub
		System.out.println("windows");
	}
}

class OS_Factory {

	public  OS getInstance(String str ) {
		 
		if(str.equals("Open"))
			return new Android();
		else 
			if (str.equals("Closed"))
				return new IOS();
			else
				if(str.equals("windows"))
				return new Windows();
		return null;
		
	}
	
}


public class FactoryMain {

		public static void main(String[] args) {
			
			OS obj = new Android();
			obj.spec();
			
			OS_Factory osf = new OS_Factory();
			OS obj2 = osf.getInstance("windows");
			obj2.spec();
			
			
		}
}
