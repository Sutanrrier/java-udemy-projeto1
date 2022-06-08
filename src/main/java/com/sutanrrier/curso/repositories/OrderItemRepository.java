package com.sutanrrier.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sutanrrier.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer>{

}
