package com.filtro.springfiltro.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "modelo")
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT UNSIGNED")
    private long id;

    @Column(name = "nombre", columnDefinition = "VARCHAR(100)", nullable = false)
    @NotBlank(message =  "El campo 'nombre' de modelo no puede estar vacío. Por favor ingrese información válida.")
    @NotNull(message = "El campo 'nombre' de modelo, exige el ingreso de información.")
    @Min(4)
    @Max(100)
    private String nombre;

    @Column(name = "descripcion", columnDefinition = "VARCHAR(200)", nullable = false)
    @NotBlank(message =  "El campo 'descripcion' de modelo no puede estar vacío. Por favor ingrese información válida.")
    @NotNull(message = "El campo 'descripcion' de modelo, exige el ingreso de información.")
    @Min(15)
    @Max(200)
    private String descripcion;


    public Modelo() {
    
    }


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}