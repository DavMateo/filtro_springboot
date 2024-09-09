package com.filtro.springfiltro.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.filtro.springfiltro.domain.entity.Bicicleta;

public interface BicicletaRepository extends JpaRepository<Bicicleta, Long> {

}
