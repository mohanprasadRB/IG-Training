package com.restservices.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
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

import com.restservices.demo.beans.Country;
import com.restservices.demo.repositories.CountryRepository;
import com.restservices.demo.services.CountryService;

@SpringBootTest(classes = { ServiceMackitoTests.class })
@TestMethodOrder(OrderAnnotation.class)
public class ServiceMackitoTests {

	@Mock
	CountryRepository countryrep;

	@InjectMocks
	CountryService countryService;

	public List<Country> mycountries;
	
	@Test
	@Order(1)
	public void test_getAllCountries() {
		
		List<Country> mycountries = new ArrayList<Country>();
		mycountries.add(new Country(1, "India", "Delhi"));
		mycountries.add(new Country(2, "USA", "Washington"));
	
		//Mocking statement
		when(countryrep.findAll()).thenReturn(mycountries);
		countryService.getAllcountries();
		assertEquals(2,countryService.getAllcountries().size());
		 
	}
	
	@Test
	@Order(2) 
	public void test_getCountryByID()
	{
		List<Country> mycountries = new ArrayList<Country>();
		mycountries.add(new Country(1, "India", "Delhi"));
		mycountries.add(new Country(2, "USA", "Washington"));
		int countryId=1;
		
		when(countryrep.findAll()).thenReturn(mycountries);
		assertEquals(countryId,countryService.getCountrybyId(countryId).getId());
	}
	
	@Test
	@Order(3)
	public void test_getCountryByname()
	{
		List<Country> mycountries = new ArrayList<Country>();
		mycountries.add(new Country(1, "India", "Delhi"));
		mycountries.add(new Country(1, "USA", "WashingtonDC"));
		
		String countryName="India";
		
		when(countryrep.findAll()).thenReturn(mycountries);
		assertEquals(countryName,countryService.getCountrybyName(countryName).getCountryName());
	}
	
	
	@Test
	@Order(4)
	public void test_addCountry()
	{
		Country country = new Country(3,"Germany","Berlin");
		
		when(countryrep.save(country)).thenReturn(country);
		assertEquals(country,countryService.addCountry(country));
		
	}
	
	@Test
	@Order(5)
	public void test_updateCountry()
	{
		Country country = new Country(3,"Germany","Berlin");
		when(countryrep.save(country)).thenReturn(country);
		assertEquals(country, countryService.updateCountry(country));
	}
	
	@Test
	@Order(6)
	public void test_deleteCountry()
	{
		Country country = new Country(3,"Germany","Berlin");
		countryService.deleteCountry(country);
		verify(countryrep,times(1)).delete(country);

	}
}
