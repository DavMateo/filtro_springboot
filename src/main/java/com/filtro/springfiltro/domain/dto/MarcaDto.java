package com.filtro.springfiltro.domain.dto;

public class MarcaDto {
    private long id;
    private String nombre;


    public MarcaDto() {

    }

    public MarcaDto(long id, String nombre) {
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