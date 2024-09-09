package com.filtro.springfiltro.domain.dto;

import com.filtro.springfiltro.domain.entity.Compra;
import com.filtro.springfiltro.domain.entity.Repuesto;

public class DetallecompraDto {
    private long id;
    private int cantidad;
    private float precio_unitario;
    private Compra compra;
    private Repuesto repuesto;


    public DetallecompraDto() {

    }

    public DetallecompraDto(long id, int cantidad, float precio_unitario, Compra compra, Repuesto repuesto) {
        this.id = id;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.compra = compra;
        this.repuesto = repuesto;
    }


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }


    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public float getPrecio_unitario() {
        return precio_unitario;
    }
    public void setPrecio_unitario(float precio_unitario) {
        this.precio_unitario = precio_unitario;
    }


    public Compra getCompra() {
        return compra;
    }
    public void setCompra(Compra compra) {
        this.compra = compra;
    }


    public Repuesto getRepuesto() {
        return repuesto;
    }
    public void setRepuesto(Repuesto repuesto) {
        this.repuesto = repuesto;
    }
}