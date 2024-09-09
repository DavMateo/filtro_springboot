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
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "bicicletas")
public class Bicicleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT UNSIGNED")
    private long id;

    @Column(name = "precio", columnDefinition = "DECIMAL(10, 2) UNSIGNED", nullable = false)
    @NotNull(message = "El campo 'precio' de bicicleta, exige el ingreso de información.")
    @Min(0)
    private float precio;

    @Column(name = "stock", columnDefinition = "INT UNSIGNED", nullable = false)
    @NotNull(message = "El campo 'stock' de bicicleta, exige el ingreso de información.")
    @Min(1)
    @Max(10000)
    private int stock;

    @ManyToOne
    @JoinColumn(name = "modelo", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "El campo 'modelo' de tipo ID de bicicleta, exige el ingreso de información.")
    private Modelo modelo;

    @ManyToOne
    @JoinColumn(name = "marca", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "El campo 'marca' de tipo ID de bicicleta, exige el ingreso de información.")
    private Marca marca;


    public Bicicleta() {

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