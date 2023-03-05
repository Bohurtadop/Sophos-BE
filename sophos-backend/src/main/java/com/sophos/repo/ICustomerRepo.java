package com.sophos.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sophos.model.Customer;

public interface ICustomerRepo extends JpaRepository<Customer, Integer> {

}
