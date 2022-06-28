 package com.restservices.demo.controllers;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restservices.demo.beans.Country;
import com.restservices.demo.services.CountryService;

@RestController
public class CountryController {
 
	
	@Autowired
	CountryService countryService;
	
	//http://localhost:9090/getcountries
	@GetMapping("/getcountries") 
	public ResponseEntity<List<Country>> getCountries()
	{
		
		try 
		{
		 List<Country> country=  countryService.getAllcountries();
		 return new ResponseEntity<List<Country>>(country,HttpStatus.FOUND);
		}
		catch(Exception e)
		{
			return new ResponseEntity<List<Country>>(HttpStatus.NOT_FOUND);
		}
		 
 		 
	}
	
	
	//http://localhost:9090/getcountries/1
	@GetMapping("/getcountries/{id}")
	public ResponseEntity<Country> getCountryById(@PathVariable(value="id")int id)
	{
		try 
		{
		 Country country=  countryService.getCountrybyId(id);
		 return new ResponseEntity<Country>(country,HttpStatus.FOUND);
		}
		catch(Exception e)
		{
			return new ResponseEntity<Country>(HttpStatus.NOT_FOUND);
		}
		
		
	}
	
	
	//http://localhost:9090/getcountries/countryname?name=USA
	@GetMapping("/getcountries/countryname")
	public ResponseEntity<Country> getCountrybyName(@RequestParam(value = "name") String countryName)
	{
		try 
		{
		 Country country =  countryService.getCountrybyName(countryName);
		 return new ResponseEntity<Country>(country,HttpStatus.FOUND);
		}
		catch(Exception e)
		{
			return new ResponseEntity<Country>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	
	//http://localhost:9090/addcountry
	@PostMapping("addcountry")
	public ResponseEntity<Country> addCountry(@RequestBody Country country)
	{
		try 
		{
		  countryService.addCountry(country);
		  return new ResponseEntity<Country>(country,HttpStatus.CREATED);
		}
		
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
	}
	
	//http://localhost:9090/updateCountry/1   //
//	{
//		"id": 1,
//		"countryName": "Tajakistan",
//		"countryCapital": "tajak"
//		}
	
	
	@PutMapping("/updateCountry/{id}")
	 public ResponseEntity<Country> updateCountry(@PathVariable(value = "id") int id, @RequestBody Country country)
	 {
		
		try
		{
		Country existcouCountry = countryService.getCountrybyId(id);
		
		  existcouCountry.setCountryName(country.getCountryName());
		  existcouCountry.setCountryCapital(country.getCountryCapital());
		  
		  Country updated_country = countryService.updateCountry(existcouCountry);
		  
		return  new ResponseEntity<Country>(updated_country,HttpStatus.OK);
	 }
		
		catch (Exception e) {
 
		}
		return new ResponseEntity<Country>(HttpStatus.CONFLICT);
	 }
	
	
	@DeleteMapping("/deletecountry/{id}")
	public ResponseEntity<Country> deleteCountry(@PathVariable(value="id") int id)
	{
		Country country = null;
		
		try
		{
			country = countryService.getCountrybyId(id);
			countryService.deleteCountry(country);
		}
		
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Country>(HttpStatus.NOT_FOUND);
		}
		 
		return new ResponseEntity<Country>(country, HttpStatus.OK);
	 
	}
	 
	//http://localhost:9090/deletecountry/2
//	@DeleteMapping("/deletecountry/{id}")
//	public AddResponse deleteCountry(@PathVariable(value="id") int id)
//	{
//		
//		System.out.println("Country deleted"+id);
//		return countryService.deleteCountry(id);
//		
//	}
//	
//	public String deleteCountry(@PathVariable(value="id") int id)
//	{
//		return countryService.deleteCountry(id);
//		
//	}
	 
	
}
