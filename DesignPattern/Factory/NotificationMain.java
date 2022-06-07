package com.java.DesignPattern.Factory;

interface notify
{
	void notification();
}

class SMS implements notify {

	@Override
	public void notification() {
		// TODO Auto-generated method stub
		System.out.println("SMS Notification");	
	}
}


class Mail implements notify {

	@Override
	public void notification() {
		// TODO Auto-generated method stub
		System.out.println("Mail notification");	
	}	
}


class Mail_Factory {
	
	public notify getNotificationInstance(String str) {
		 if(str.equals("SMS"))
			 return new SMS();
		 else if(str.equals("MAIL"))
			 return new Mail();
		 else
		 {
			 System.out.println("Nothing matched");
			 return null;
		 }
	}
}


public class NotificationMain {
	
	public static void main(String[] args) {
		
		notify obj = new Mail();
		obj.notification();
		
		 notify mobj = new Mail_Factory().getNotificationInstance("SMS");
		 mobj.notification();
		 
	}

}
