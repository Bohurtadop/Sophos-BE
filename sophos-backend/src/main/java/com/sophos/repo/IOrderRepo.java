package com.sophos.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sophos.model.Order;

public interface IOrderRepo extends JpaRepository<Order, Integer> {

}
