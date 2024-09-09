package com.filtro.springfiltro.infrastructure.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.filtro.springfiltro.application.service.IBicicletaService;
import com.filtro.springfiltro.domain.entity.Bicicleta;
import jakarta.persistence.EntityNotFoundException;
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



@RestController
@RequestMapping("/bicicleta")
public class BicicletaRestController {
    
    private final IBicicletaService bicicletaService;

    @Autowired
    public BicicletaRestController(IBicicletaService bicicletaService) {
        this.bicicletaService = bicicletaService;
    }



    @GetMapping
    public List<Bicicleta> getAllBicicletas() {
        return bicicletaService.findAll();
    }


    @PostMapping
    public ResponseEntity<Bicicleta> createBicicleta(@RequestBody Bicicleta bicicleta) {
        Bicicleta savedBicicleta = bicicletaService.save(bicicleta);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedBicicleta);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Bicicleta> updateBicicleta(@PathVariable Long id, @RequestBody Bicicleta bicicleta) {
        bicicleta.setId(id);

        try {
            Bicicleta updateBicicleta = bicicletaService.update(bicicleta);
            return ResponseEntity.ok(updateBicicleta);

        } catch(EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBicicleta(@PathVariable Long id) {
        try {
            bicicletaService.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

        } catch(EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}