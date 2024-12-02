package com.cursoudemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoudemy.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	 
}
