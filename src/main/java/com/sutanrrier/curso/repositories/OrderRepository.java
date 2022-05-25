package com.sutanrrier.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sutanrrier.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{
	
}
