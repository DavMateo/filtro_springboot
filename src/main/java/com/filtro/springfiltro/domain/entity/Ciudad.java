package com.filtro.springfiltro.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "ciudades")
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT UNSIGNED")
    private long id;

    @Column(name = "nombre", columnDefinition = "VARCHAR(100)", nullable = false)
    @NotBlank(message =  "El campo 'nombre' de ciudad no puede estar vacío. Por favor ingrese información válida.")
    @NotNull(message = "El campo 'nombre' de ciudad, exige el ingreso de información.")
    @Min(4)
    @Max(100)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "pais_id", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "El campo 'pais_id' de ciudad, exige el ingreso de información.")
    private Pais paises;


    public Ciudad() {

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


    public Pais getPaises() {
        return paises;
    }
    public void setPaises(Pais paises) {
        this.paises = paises;
    }
}