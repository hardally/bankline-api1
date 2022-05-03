package com.dio.santander.bankline.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.bankline.api.model.correntista;
import com.dio.santander.bankline.api.repository.CorrentistaRepository;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {
	
	@Autowired
	private	CorrentistaRepository repository;
	
	@GetMapping
	public List<correntista> findAll(){ 
		return repository.findAll();
	}
	
}
