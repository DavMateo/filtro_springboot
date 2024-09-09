package com.filtro.springfiltro.domain.dto;

import com.filtro.springfiltro.domain.entity.Bicicleta;
import com.filtro.springfiltro.domain.entity.Venta;

public class DetalleventaDto {
    private long id;
    private int cantidad;
    private float preciounitario;
    private Venta venta;
    private Bicicleta bicicleta;


    public DetalleventaDto() {

    }

    public DetalleventaDto(long id, int cantidad, float preciounitario, Venta venta, Bicicleta bicicleta) {
        this.id = id;
        this.cantidad = cantidad;
        this.preciounitario = preciounitario;
        this.venta = venta;
        this.bicicleta = bicicleta;
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

    public float getPreciounitario() {
        return preciounitario;
    }
    public void setPreciounitario(float preciounitario) {
        this.preciounitario = preciounitario;
    }

    public Venta getVenta() {
        return venta;
    }
    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }
    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }
}