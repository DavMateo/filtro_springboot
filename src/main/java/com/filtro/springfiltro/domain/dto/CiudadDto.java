package com.filtro.springfiltro.domain.dto;

import com.filtro.springfiltro.domain.entity.Pais;

public class CiudadDto {
    private long id;
    private String nombre;
    private Pais paises;


    public CiudadDto() {

    }

    public CiudadDto(long id, String nombre, Pais paises) {
        this.id = id;
        this.nombre = nombre;
        this.paises = paises;
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