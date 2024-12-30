package com.mbaziekone.mybook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbaziekone.mybook.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
