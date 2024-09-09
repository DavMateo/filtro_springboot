package com.filtro.springfiltro.application.service;

import java.util.List;
import com.filtro.springfiltro.domain.entity.Marca;

public interface IMarcaService {
    List<Marca> findAll();
    Marca save(Marca marca);
    Marca update(Marca marca);
    void deleteById(Long id);
}
