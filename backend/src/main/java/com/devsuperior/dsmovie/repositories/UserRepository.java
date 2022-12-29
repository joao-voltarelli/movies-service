package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.User;

// Objeto responsável por acessar o banco de dados

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}
