package com.cursoudemy.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoudemy.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	 
}
