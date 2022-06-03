package com.java.oops.Inheritance;

class Student {
	
	private int id;
	private String name;
	private String course;
	Address address;
	/**
	 * @param id
	 * @param name
	 * @param course
	 * @param address
	 */
	public Student(int id, String name, String course, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.address = address;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Address getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", address=" + address + "]";
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}

class Address {
	
	private int Zipcode;
	private String Street;
	private String District;
	private String State;

	/**
	 * @param i
	 * @param street
	 * @param district
	 * @param state
	 */
	
	public Address(int i, String street, String district, String state) {
		super();
		Zipcode = i;
		Street = street;
		District = district;
		State = state;
	}

	public Address() {
		// TODO Auto-generated constructor stub
	}

	


	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getZipcode() {
		return Zipcode;
	}

	public void setZipcode(int zipcode) {
		this.Zipcode=zipcode;
	}

	@Override
	public String toString() {
		return "Address [Zipcode=" + Zipcode + ", Street=" + Street + ", District=" + District + ", State=" + State
				+ "]";
	}
}

class College {
	
	private String collegeName;
	Address address;
}

public class Aggregation {
	public static void main(String[] args) {
	
	   //Using SetterMethod
		Address address= new Address();
		address.setDistrict("Bangalore");
		address.setState("karnataka");
		address.setStreet("Ambedkar Veedhi");
		address.setZipcode(560001);
		
		//
		Address collegeAddress= new Address(560001,"AmbedkarVeedhi","Bangalore", "karnataka");
		System.out.println( collegeAddress);
		
		//Using Constructor
		Student obj = new Student(101, "mohan", "cse", address);
		System.out.println(obj);
		Student obj2 = new Student(101, "mohan", "cse", collegeAddress);
		System.out.println(obj2);
		 
		
	}
	

}
