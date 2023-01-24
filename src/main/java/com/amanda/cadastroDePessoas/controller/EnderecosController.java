package com.amanda.cadastroDePessoas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amanda.cadastroDePessoas.model.Enderecos;
import com.amanda.cadastroDePessoas.repository.EnderecosRepository;

@RestController
@RequestMapping("/enderecos")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class EnderecosController {

	@Autowired
	private EnderecosRepository enderecosRepository;
	
	@GetMapping
	public ResponseEntity<List<Enderecos>> getAll(){
		return ResponseEntity.ok(enderecosRepository.findAll());
	}
	
	
}
