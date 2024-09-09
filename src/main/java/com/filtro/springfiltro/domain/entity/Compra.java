package com.filtro.springfiltro.domain.entity;

import java.time.LocalDateTime;

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
@Table(name = "compras")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT UNSIGNED")
    private long id;

    @Column(name = "fecha", columnDefinition = "DATE", nullable = false)
    @NotBlank(message =  "El campo 'fecha' de compras no puede estar vacío. Por favor ingrese información válida.")
    @NotNull(message = "El campo 'fecha' de compras, exige el ingreso de información.")
    private LocalDateTime fecha;

    @Column(name = "total", columnDefinition = "DECIMAL(10, 2) UNSIGNED", nullable = false)
    @NotNull(message = "El campo 'total' de compras, exige el ingreso de información.")
    @Min(1)
    private float total;

    @ManyToOne
    @JoinColumn(name = "proveedor_id", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "El campo 'proveedor_id' de compras, exige el ingreso de información.")
    private Proveedor proveedor;


    public Compra() {

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