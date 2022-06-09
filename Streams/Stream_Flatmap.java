package com.java.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

class Emp1
{
	private long empId;
	private String name;
	private int age;
	private String Designation;
	 
	public Emp1(long empId, String name, int age, String designation) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		Designation = designation;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	@Override
	public String toString() {
		return " empId=" + empId + ", name=" + name + ", age=" + age + ", Designation=" + Designation + "";
	}
}

public class Stream_Flatmap {
	
	public static void main(String[] args) {
		
		List<Emp1> elist = new ArrayList<Emp1>();
		 
		elist.add(new Emp1(101, "Mohan", 28, "Develeoper"));
		elist.add(new Emp1(102, "RB", 27, "Developer"));
		elist.add(new Emp1(103, "Rohan", 29, "Manager"));
		
 		elist.stream().filter(p->p.getAge()>25).filter(p->p.getDesignation()
								  .equals("Manager")).forEach
								   (s->System.out.printf("Employee name \t %s  \nEmployee Age \t%d \nEmployee Designation \t%s\n",s.getName(),s.getAge(),s.getDesignation()));
		
		elist.stream().filter(p->p.getAge()>25).filter(p->p.getDesignation()
				  .equals("Manager")).forEach
				   (s->System.out.println(s));
		
	     
		
		OptionalDouble average = elist.stream().mapToInt(p-> p.getAge()).average();
		
		 
	}

}
