package com.filtro.springfiltro.domain.dto;

import java.time.LocalDateTime;

import com.filtro.springfiltro.domain.entity.Proveedor;

public class CompraDto {
    private long id;
    private LocalDateTime fecha;
    private float total;
    private Proveedor proveedor;


    public CompraDto() {

    }

    public CompraDto(long id, LocalDateTime fecha, float total, Proveedor proveedor) {
        this.id = id;
        this.fecha = fecha;
        this.total = total;
        this.proveedor = proveedor;
    }


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }


    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }


    public float getTotal() {
        return total;
    }
    public void setTotal(float total) {
        this.total = total;
    }


    public Proveedor getProveedor() {
        return proveedor;
    }
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
}