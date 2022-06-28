package com.restservices.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restservices.demo.beans.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {
	

}
