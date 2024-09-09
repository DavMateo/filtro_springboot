package com.filtro.springfiltro.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "detalles_compras")
public class Detallecompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT UNSIGNED")
    private long id;

    @Column(name = "cantidad", columnDefinition = "INT UNSIGNED", nullable = false)
    @NotNull(message = "El campo 'cantidad' de detalles_compras, exige el ingreso de información.")
    @Min(4)
    @Max(999)
    private int cantidad;

    @Column(name = "precio_unitario", columnDefinition = "DECIMAL(10, 2) UNSIGNED", nullable = false)
    @NotNull(message = "El campo 'precio_unitario' de detalles_compras, exige el ingreso de información.")
    @Min(4)
    private float precio_unitario;

    @ManyToOne
    @JoinColumn(name = "compra_id", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "El campo 'compra_id' de detalles_compras, exige el ingreso de información.")
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "repuesto_id", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "El campo 'repuesto_id' de detalles_compras, exige el ingreso de información.")
    private Repuesto repuesto;


    public Detallecompra() {

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