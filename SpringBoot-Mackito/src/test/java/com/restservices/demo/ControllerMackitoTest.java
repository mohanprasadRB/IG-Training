package com.restservices.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.restservices.demo.beans.Country;
import com.restservices.demo.controllers.CountryController;
import com.restservices.demo.services.CountryService;

@TestMethodOrder(OrderAnnotation.class)
@SpringBootTest(classes= {ControllerMackitoTest.class})
public class ControllerMackitoTest {
	
	@Mock
	CountryService countryService;
	
	@InjectMocks
	CountryController countryController;
	
	List<Country> mycountries;
	Country country;
	
	
	@Test
	@Order(1)
	public void test_getAllCountries()
	{
		mycountries = new ArrayList<Country>();
		mycountries.add(new Country(1, "India", "Delhi"));
		mycountries.add(new Country(2, "USA", "Washington"));
		
		when(countryService.getAllcountries()).thenReturn(mycountries);
		ResponseEntity<List<Country>> res = countryController.getCountries();
		
		assertEquals(HttpStatus.FOUND,res.getStatusCode());
		assertEquals(2,res.getBody().size());
	}
	
	@Test
	@Order(2)
	public void test_getCountrybyID() {
		
		country = new Country(2, "USA", "Washington");
		int countryID = 2;
		
		when(countryService.getCountrybyId(countryID)).thenReturn(country); 
			ResponseEntity<Country>res =countryController.getCountryById(countryID);
			
			assertEquals(HttpStatus.FOUND, res.getStatusCode());
			assertEquals(countryID, res.getBody().getId());
	}

	
	@Test
	@Order(3)
	public void test_getCountryByName()
	{
		country = new Country(2, "USA", "Washington");
		String countryID = "USA";
		
		when(countryService.getCountrybyName(countryID)).thenReturn(country); 
			ResponseEntity<Country>res =countryController.getCountrybyName(countryID);
			
			assertEquals(HttpStatus.FOUND, res.getStatusCode());
			assertEquals(countryID, res.getBody().getCountryName());
	}
	
	@Test
	@Order(4)
	public void test_addCountry()
	{
		
		country = new Country(3, "Germany", "Berlin");
		
		when(countryService.addCountry(country)).thenReturn(country);
		 ResponseEntity<Country> res = countryController.addCountry(country);
		 
		 assertEquals(HttpStatus.CREATED, res.getStatusCode());
		 assertEquals(country, res.getBody());
		 
	}
	
	@Test
	@Order(5)
	public void test_updateCountry()
	{
		country = new Country(4, "Japan", "Tokyo");
		int countryID=4;
		
		when(countryService.getCountrybyId(countryID)).thenReturn(country);
		when(countryService.updateCountry(country)).thenReturn(country);
		
		ResponseEntity<Country> res = countryController.updateCountry(countryID, country);
		assertEquals(HttpStatus.OK, res.getStatusCode());
		assertEquals("Japan", res.getBody().getCountryName());
		assertEquals("Tokyo", res.getBody().getCountryCapital());
		assertEquals(4, res.getBody().getId());
	}
	
	
	@Test
	@Order(6)
	public void test_deleteountry()
	{
		country = new Country(3, "Japan", "Tokyo");
		int countryID=3;
		
		when(countryService.getCountrybyId(countryID)).thenReturn(country);
		ResponseEntity<Country> res = countryController.deleteCountry(countryID);
		assertEquals(HttpStatus.OK, res.getStatusCode());
		 
	}
	
 
}
