package com.filtro.springfiltro.domain.dto;

import com.filtro.springfiltro.domain.entity.Ciudad;

public class ClienteDto {
    private long id;
    private String nombre;
    private String email;
    private int telefono;
    private String password;
    private Ciudad ciudad;


    public ClienteDto() {

    }

    public ClienteDto(long id, String nombre, String email, int telefono, String password, Ciudad ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.password = password;
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


    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    public Ciudad getCiudad() {
        return ciudad;
    }
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}