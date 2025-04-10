package com.nandica.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nandica.demo.entities.Funcionario;
import com.nandica.demo.repositories.FuncionarioRepository;

@Service
public final class FuncionarioService {
	
private FuncionarioRepository funcionarioRepository;
	
	@Autowired
	private FuncionarioService(FuncionarioRepository funcionarioRepository) {
		this.funcionarioRepository = funcionarioRepository;
	}
	
	public Funcionario getFuncionarioById(Long id) {
		return funcionarioRepository.findById(id).orElse(null);
	}
	
	public List<Funcionario> getAllFuncionarios(){
		return funcionarioRepository.findAll();
	}
	
	public Funcionario saveFuncionario(Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	} 

}

