package com.java.oops.Inheritance;

class Teacher {
	   private String designation = "Professor";
	   private String collegeName = "UVCE";
	   public String getDesignation() {
		return designation;
	   }
	   protected void setDesignation(String designation) {
		this.designation = designation;
	   }
	   protected String getCollegeName() {
		return collegeName;
	   }
	   protected void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	   }
	   
	   void does(){
		System.out.println("Teaching");
	   }
	}

	public class Single_Inheritance2 extends Teacher{
	   String mainSubject = "Physics";
	   public static void main(String args[]){
		Single_Inheritance2 obj = new Single_Inheritance2();
		/* Note: we are not accessing the data members 
		 * directly we are using public getter method 
		 * to access the private members of parent class
		 */
		System.out.println(obj.getCollegeName());
		System.out.println(obj.getDesignation());
		obj.does();
		System.out.println(obj.mainSubject);
	   }
	}
	
	//The derived class inherits all the members and methods that are declared 
//	as public or protected. If the members or methods of super class are declared 
//	as private then the derived class cannot use them directly. The private members
//	can be accessed only in its own class. Such private members can only be accessed 
//	using public or protected getter and setter methods of super class.