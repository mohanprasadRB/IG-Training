package com.java.Streams;

import java.util.ArrayList;
import java.util.List;

class Empl
{
	private String ename;
	private int 	eid;
	  double	salary;
 
	public Empl(String ename, int eid, double salary) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\nEmpl [ename=" + ename + ", eid=" + eid + ", salary=" + salary + "]";
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
public class Stream_Distinct_Salary {
	public static void main(String[] args) 
	{
		
	List<Empl> e = new ArrayList<Empl>();
		
		 e.add(new Empl("Mohan", 101, 1000));
		 e.add(new Empl("Mohan", 101, 1000));
		 e.add(new Empl("Mohan", 101, 1000));
		 e.add(new Empl("Rb", 100, 20000));
		 e.add(new Empl("Prasad", 100, 30000));
		 e.add(new Empl("Prasad", 100, 30000));
		 e.add(new Empl("Prasad", 100, 30000));
		
  System.out.println(e);
		 e.stream().forEach(s->System.out.println(s.getEname()+" \t"+s.getSalary()));
		 
		 System.out.println("Using Distinct salary");
		 
		 System.out.println(e.stream().map(m->m.getSalary()).distinct().count());
		 
		 e.stream().map(m->m.getSalary()).distinct().forEach(s->System.out.println(s));
		 
 	}

}
