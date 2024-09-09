package com.filtro.springfiltro.application.service;

import java.util.List;
import com.filtro.springfiltro.domain.entity.Bicicleta;

public interface IBicicletaService {
    List<Bicicleta> findAll();
    Bicicleta save(Bicicleta bicicleta);
    Bicicleta update(Bicicleta bicicleta);
    void deleteById(Long id);
}
