package com.cursoudemy.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoudemy.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	 
}
