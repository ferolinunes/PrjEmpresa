package com.nandica.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nandica.demo.entities.Dependente;
import com.nandica.demo.repositories.DependenteRepository;

@Service
public class DependenteService {
	
private DependenteRepository dependenteRepository;
	
	@Autowired
	private DependenteService(DependenteRepository dependenteRepository) {
		this.dependenteRepository = dependenteRepository;
	}
	
	public Dependente getDependenteById(Long id) {
		return dependenteRepository.findById(id).orElse(null);
	}
	
	public List<Dependente> getAllDependentes(){
		return dependenteRepository.findAll();
	}
	
	public Dependente saveDependente(Dependente dependente) {
		return dependenteRepository.save(dependente);
	} 

}
