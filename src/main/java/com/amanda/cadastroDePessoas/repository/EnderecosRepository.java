package com.amanda.cadastroDePessoas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amanda.cadastroDePessoas.model.Enderecos;

@Repository
public interface EnderecosRepository extends JpaRepository<Enderecos, Long> {

	
	
	
}
