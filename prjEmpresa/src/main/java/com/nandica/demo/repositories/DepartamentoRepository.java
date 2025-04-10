package com.nandica.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandica.demo.entities.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

}
