package com.cursoudemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoudemy.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	 
}
