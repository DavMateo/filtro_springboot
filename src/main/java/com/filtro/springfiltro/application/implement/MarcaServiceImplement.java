package com.filtro.springfiltro.application.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.filtro.springfiltro.application.service.IMarcaService;
import com.filtro.springfiltro.domain.entity.Marca;
import com.filtro.springfiltro.infrastructure.repository.MarcaRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class MarcaServiceImplement implements IMarcaService {
    @Autowired
    private MarcaRepository marcaRepository;

    @Override
    public List<Marca> findAll() {
        return marcaRepository.findAll();
    }

    @Override
    public Marca save(Marca marca) {
        return marcaRepository.save(marca);
    }

    @Override
    public Marca update(Marca marca) {
        if(marcaRepository.existsById(marca.getId())) {
            return marcaRepository.save(marca);
        } else {
            throw new EntityNotFoundException("La marca que se busca no existe en el sistema.");
        }
    }

    @Override
    public void deleteById(Long id) {
        if(marcaRepository.existsById(id)) {
            marcaRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("La marca que se busca no existe en el sistema.");
        }
    }
}
