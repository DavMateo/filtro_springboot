package com.filtro.springfiltro.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filtro.springfiltro.domain.entity.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long> {

}
