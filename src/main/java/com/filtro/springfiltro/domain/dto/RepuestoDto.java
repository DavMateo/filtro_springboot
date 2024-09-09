package com.filtro.springfiltro.domain.dto;

import com.filtro.springfiltro.domain.entity.Marca;
import com.filtro.springfiltro.domain.entity.Modelo;
import com.filtro.springfiltro.domain.entity.Proveedor;

public class RepuestoDto {
    private long id;
    private String nombre;
    private String descripcion;
    private float precio;
    private int stock;
    private Proveedor proveedor;
    private Modelo modelo;
    private Marca marca;


    public RepuestoDto() {

    }

    public RepuestoDto(long id, String nombre, String descripcion, float precio, int stock, Proveedor proveedor,
            Modelo modelo, Marca marca) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.proveedor = proveedor;
        this.modelo = modelo;
        this.marca = marca;
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


    public Proveedor getProveedor() {
        return proveedor;
    }
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
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