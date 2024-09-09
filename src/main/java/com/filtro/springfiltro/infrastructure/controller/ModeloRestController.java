package com.filtro.springfiltro.infrastructure.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.filtro.springfiltro.application.service.IModeloService;
import com.filtro.springfiltro.domain.entity.Modelo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/modelo")
public class ModeloRestController {
    private final IModeloService modeloService;

    @Autowired
    public ModeloRestController(IModeloService modeloService) {
        this.modeloService = modeloService;
    }


    @GetMapping public List<Modelo> getAllModelos() {
        return modeloService.findAll();
    }


    @PostMapping
    public ResponseEntity<Modelo> createModelo(@RequestBody Modelo modelo) {
        Modelo savedModelo = modeloService.save(modelo);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedModelo);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Modelo> updateModelo(@PathVariable Long id, @RequestBody Modelo modelo) {
        modelo.setId(id);

        try {
            Modelo updateModelo = modeloService.update(modelo);
            return ResponseEntity.ok(updateModelo);

        } catch(EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
    

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteModelo(@PathVariable Long id) {
        try {
            modeloService.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

        } catch(EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
