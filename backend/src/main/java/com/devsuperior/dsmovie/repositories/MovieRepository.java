package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Movie;

// Objeto responsável por acessar o banco de dados

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
}
