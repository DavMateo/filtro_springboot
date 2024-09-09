package com.filtro.springfiltro.infrastructure.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.filtro.springfiltro.application.service.IMarcaService;
import com.filtro.springfiltro.domain.entity.Marca;
import jakarta.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/marca")
public class MarcaRestController {
    private final IMarcaService marcaService;

    @Autowired
    public MarcaRestController(IMarcaService marcaService) {
        this.marcaService = marcaService;
    }



    @GetMapping
    public List<Marca> getAllMarcas() {
        return marcaService.findAll();
    }


    @PostMapping
    public ResponseEntity<Marca> createMarca(@RequestBody Marca marca) {
        Marca savedMarca = marcaService.save(marca);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedMarca);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Marca> updateMarca(@PathVariable Long id, @RequestBody Marca marca) {
        marca.setId(id);

        try {
            Marca updateMarca = marcaService.update(marca);
            return ResponseEntity.ok(updateMarca);

        } catch(EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMarca(@PathVariable Long id) {
        try {
            marcaService.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

        } catch(EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
