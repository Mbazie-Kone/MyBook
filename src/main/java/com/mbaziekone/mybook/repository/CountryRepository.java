package com.mbaziekone.mybook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbaziekone.mybook.model.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {
	
}
