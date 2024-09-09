package com.filtro.springfiltro.application.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.filtro.springfiltro.application.service.IBicicletaService;
import com.filtro.springfiltro.domain.entity.Bicicleta;
import com.filtro.springfiltro.infrastructure.repository.BicicletaRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class BicicletaServiceImplement implements IBicicletaService {
    @Autowired
    private BicicletaRepository bicicletaRepositoryInterface;

    @Override
    public List<Bicicleta> findAll() {
        return bicicletaRepositoryInterface.findAll();
    }

    @Override
    public Bicicleta save(Bicicleta bicicleta) {
        return bicicletaRepositoryInterface.save(bicicleta);
    }

    @Override
    public Bicicleta update(Bicicleta bicicleta) {
        if(bicicletaRepositoryInterface.existsById(bicicleta.getId())) {
            return bicicletaRepositoryInterface.save(bicicleta);
        } else {
            throw new EntityNotFoundException("La bicicleta que se busca no existe en el sistema.");
        }
    }

    @Override
    public void deleteById(Long id) {
        if(bicicletaRepositoryInterface.existsById(id)) {
            bicicletaRepositoryInterface.deleteById(id);
        } else {
            throw new EntityNotFoundException("La bicicleta que se busca no existe en el sistema.");
        }
    }
}