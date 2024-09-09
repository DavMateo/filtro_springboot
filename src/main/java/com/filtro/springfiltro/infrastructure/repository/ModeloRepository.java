package com.filtro.springfiltro.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.filtro.springfiltro.domain.entity.Modelo;

public interface ModeloRepository extends JpaRepository<Modelo, Long> {
   
}
