package com.nandica.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandica.demo.entities.Dependente;

public interface DependenteRepository extends JpaRepository<Dependente, Long> {

}
