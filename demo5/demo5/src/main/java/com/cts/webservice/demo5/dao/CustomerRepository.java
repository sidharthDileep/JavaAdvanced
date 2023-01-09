package com.cts.webservice.demo5.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.webservice.demo5.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);

	Customer findById(int id);

}
