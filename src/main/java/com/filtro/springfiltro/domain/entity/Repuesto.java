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
@Table(name = "repuestos")
public class Repuesto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT UNSIGNED")
    private long id;

    @Column(name = "nombre", columnDefinition = "VARCHAR(100)", nullable = false)
    @NotBlank(message =  "El campo 'nombre' de repuestos no puede estar vacío. Por favor ingrese información válida.")
    @NotNull(message = "El campo 'nombre' de repuestos, exige el ingreso de información.")
    @Min(4)
    @Max(100)
    private String nombre;

    @Column(name = "descripcion", columnDefinition = "VARCHAR(200)", nullable = false)
    @NotBlank(message =  "El campo 'descripcion' de repuestos no puede estar vacío. Por favor ingrese información válida.")
    @NotNull(message = "El campo 'descripcion' de repuestos, exige el ingreso de información.")
    @Min(20)
    @Max(200)
    private String descripcion;

    @Column(name = "precio", columnDefinition = "DECIMAL(10, 2) UNSIGNED", nullable = false)
    @NotNull(message = "El campo 'precio' de repuestos, exige el ingreso de información.")
    @Min(0)
    private float precio;

    @Column(name = "stock", columnDefinition = "INT UNSIGNED", nullable = false)
    @NotNull(message = "El campo 'stock' de repuestos, exige el ingreso de información.")
    @Min(0)
    private int stock;

    @ManyToOne
    @JoinColumn(name = "proveedor_id", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "El campo 'proveedor_id' de repuestos, exige el ingreso de información.")
    private Proveedor proveedor;

    @ManyToOne
    @JoinColumn(name = "modelo_id", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "El campo 'modelo_id' de repuestos, exige el ingreso de información.")
    private Modelo modelo;

    @ManyToOne
    @JoinColumn(name = "marca_id", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "El campo 'marca_id' de repuestos, exige el ingreso de información.")
    private Marca marca;


    public Repuesto() {

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