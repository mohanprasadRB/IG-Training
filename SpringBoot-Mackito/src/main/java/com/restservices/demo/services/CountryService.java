package com.restservices.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.restservices.demo.beans.Country;
import com.restservices.demo.controllers.AddResponse;
import com.restservices.demo.repositories.CountryRepository;

@Component
@Service
public class CountryService {
	 
	@Autowired
	CountryRepository countryrep;

	public List<Country>  getAllcountries() {

		return countryrep.findAll(); 
	}
	
	public Country getCountrybyId(int id) {

		
	// return countryrep.findById(id).get();
		List<Country> countries=countryrep.findAll();
		Country country=null;
		
		for(Country con:countries)
		{
			if(con.getId()==id)
				country=con;
		}
		
		return country;
		
		 
	}
	
	public Country getCountrybyName(String countryName) {
		 
		List<Country> countries=countryrep.findAll();
		Country country = null;
		
		for(Country con:countries)
		{
			if(con.getCountryName().equalsIgnoreCase(countryName))
				country=con;
		}
		
		return country;
	}
	
	
	public Country addCountry(Country country) {
		
		country.setId(getMaxId());
		countryrep.save(country);
		
		return country;
 

	}
	
	public int getMaxId() {
		 
		return  countryrep.findAll().size()+1;
		 
	}
	
	
	public Country updateCountry(Country country) {
		 
		countryrep.save(country);
		return country;
	}
	
	public void deleteCountry(Country country)
	{
		countryrep.delete(country);
	}
	 
	public AddResponse  deleteCountry(int id)
	{
		 countryrep.deleteById(id);
		 
		 AddResponse res = new AddResponse();
		 res.setMessage("Country Deleted");
		 res.setId(id);
		 return res;
		 
	}
	
//	public String  deleteCountry(int id)
//	{
//		 countryrep.deleteById(id); 
//		 return "country deleted of Id "+id; 
//	}
	
 

}