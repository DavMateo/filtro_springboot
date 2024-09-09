package com.filtro.springfiltro.application.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.filtro.springfiltro.application.service.IModeloService;
import com.filtro.springfiltro.domain.entity.Modelo;
import com.filtro.springfiltro.infrastructure.repository.ModeloRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class ModeloServiceImplement implements IModeloService {
    @Autowired
    private ModeloRepository modeloRepository;


    @Override
    public List<Modelo> findAll() {
        return modeloRepository.findAll();
    }

    @Override
    public Modelo save(Modelo modelo) {
        return modeloRepository.save(modelo);
    }

    @Override
    public Modelo update(Modelo modelo) {
        if(modeloRepository.existsById(modelo.getId())) {
            return modeloRepository.save(modelo);
        } else {
            throw new EntityNotFoundException("El modelo que quieres actualizar no existe en la base de datos.");
        }
    }

    @Override
    public void deleteById(Long id) {
        if(modeloRepository.existsById(id)) {
            modeloRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("El modelo que quieres eliminar no existe en la base de datos.");
        }
    }
}