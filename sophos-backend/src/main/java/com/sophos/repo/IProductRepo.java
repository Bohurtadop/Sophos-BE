package com.sophos.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sophos.model.Product;

public interface IProductRepo extends JpaRepository<Product, Integer> {

}
