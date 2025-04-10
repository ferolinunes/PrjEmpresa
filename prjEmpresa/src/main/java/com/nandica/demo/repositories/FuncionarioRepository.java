package com.nandica.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandica.demo.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

}
