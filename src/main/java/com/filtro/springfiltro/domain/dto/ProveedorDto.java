package com.filtro.springfiltro.domain.dto;

import com.filtro.springfiltro.domain.entity.Ciudad;

public class ProveedorDto {
    private long id;
    private String nombre;
    private int contacto;
    private String email;
    private int telefono;
    private Ciudad ciudad;


    public ProveedorDto() {

    }

    public ProveedorDto(long id, String nombre, int contacto, String email, int telefono, Ciudad ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.contacto = contacto;
        this.email = email;
        this.telefono = telefono;
        this.ciudad = ciudad;
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


    public int getContacto() {
        return contacto;
    }
    public void setContacto(int contacto) {
        this.contacto = contacto;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    public Ciudad getCiudad() {
        return ciudad;
    }
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}