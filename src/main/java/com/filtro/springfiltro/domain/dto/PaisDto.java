package com.filtro.springfiltro.domain.dto;

public class PaisDto {
    private long id;
    private String nombre;


    public PaisDto() {

    }

    public PaisDto(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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
}