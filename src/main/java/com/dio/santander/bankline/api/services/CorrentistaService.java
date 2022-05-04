package com.dio.santander.bankline.api.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.santander.bankline.api.dto.NovoCorrentista;
import com.dio.santander.bankline.api.model.Conta;
import com.dio.santander.bankline.api.model.correntista;
import com.dio.santander.bankline.api.repository.CorrentistaRepository;

@Service
public class CorrentistaService {
	
	@Autowired
	private CorrentistaRepository repository;
	public void save(NovoCorrentista novoCorrentista ) {
		com.dio.santander.bankline.api.model.correntista correntista = new correntista();
		correntista.setCpf(novoCorrentista.getCpf());
		correntista.setNome(novoCorrentista.getNome());
		
		Conta conta = new Conta();
		conta.setSaldo(0.0);
		conta.setNumero(new Date().getTime());
		
		correntista.setConta(conta);
		repository.save(correntista); 
	}
	
}
