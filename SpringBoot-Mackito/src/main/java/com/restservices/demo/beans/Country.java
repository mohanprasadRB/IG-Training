package com.restservices.demo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

	@Id
	@Column(name="id")
	int id;
	

	@Column(name="capital")
	String countryCapital;
	
	@Column(name="country_name")
	String countryName;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryCapital() {
		return countryCapital;
	}

	public void setCountryCapital(String countryCapital) {
		this.countryCapital = countryCapital;
	}

	public Country(int id, String countryName, String countryCapital) {
		super();
		this.id = id;
		this.countryName = countryName;
		this.countryCapital = countryCapital;
	}

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

}