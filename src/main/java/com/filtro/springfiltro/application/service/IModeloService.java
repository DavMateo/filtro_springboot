package com.filtro.springfiltro.application.service;

import java.util.List;
import com.filtro.springfiltro.domain.entity.Modelo;

public interface IModeloService {
    List<Modelo> findAll();
    Modelo save(Modelo modelo);
    Modelo update(Modelo modelo);
    void deleteById(Long id);
}