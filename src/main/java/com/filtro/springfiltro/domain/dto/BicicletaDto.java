package com.filtro.springfiltro.domain.dto;

import com.filtro.springfiltro.domain.entity.Marca;
import com.filtro.springfiltro.domain.entity.Modelo;

public class BicicletaDto {
    private long id;
    private float precio;
    private int stock;
    private Modelo modelo;
    private Marca marca;


    public BicicletaDto() {

    }

    public BicicletaDto(long id, float precio, int stock, Modelo modelo, Marca marca) {
        this.id = id;
        this.precio = precio;
        this.stock = stock;
        this.modelo = modelo;
        this.marca = marca;
    }


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }


    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }


    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }


    public Modelo getModelo() {
        return modelo;
    }
    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }


    public Marca getMarca() {
        return marca;
    }
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}