package com.mylms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	private String userName;
	private int age;
	private String gender;
	private String email;
	private long mobileNo;
	private String address;
	private String userType;
	private String status;
	
}
//	public long getUserId() {
//		return userId;
//	}
//	public void setUserId(long userId) {
//		this.userId = userId;
//	}
//	public String getUserName() {
//		return userName;
//	}
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getGender() {
//		return gender;
//	}
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public long getMobileNo() {
//		return mobileNo;
//	}
//	public void setMobileNo(long mobileNo) {
//		this.mobileNo = mobileNo;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public String getUserType() {
//		return userType;
//	}
//	public void setUserType(String userType) {
//		this.userType = userType;
//	}
//	public User(long userId, String userName, int age, String gender, String email, long mobileNo, String address,
//			String userType) {
//		super();
//		this.userId = userId;
//		this.userName = userName;
//		this.age = age;
//		this.gender = gender;
//		this.email = email;
//		this.mobileNo = mobileNo;
//		this.address = address;
//		this.userType = userType;
//	}
//	public User() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//		
//	
	

