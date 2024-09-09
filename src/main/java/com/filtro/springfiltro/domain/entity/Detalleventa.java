package com.filtro.springfiltro.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "detalles_ventas")
public class Detalleventa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT UNSIGNED")
    private long id;

    @Column(name = "cantidad", columnDefinition = "INT UNSIGNED", nullable = false)
    @NotNull(message = "El campo 'cantidad' de detalles_ventas, exige el ingreso de información.")
    @Min(1)
    private int cantidad;

    @Column(name = "precio_unitario", columnDefinition = "DECIMAL(10, 2)", nullable = false)
    @NotNull(message = "El campo 'precio_unitario' de detalles_ventas, exige el ingreso de información.")
    @Min(0)
    private float preciounitario;

    @ManyToOne
    @JoinColumn(name = "venta_id", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "El campo 'venta_id' de detalles_ventas, exige el ingreso de información.")
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "bicicleta_id", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "El campo 'bicicleta_id' de detalles_ventas, exige el ingreso de información.")
    private Bicicleta bicicleta;


    public Detalleventa() {

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