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
@Table(name = "proveedores")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT UNSIGNED")
    private long id;

    @Column(name = "nombre", columnDefinition = "VARCHAR(100)", nullable = false)
    @NotBlank(message =  "El campo 'nombre' de proveedores no puede estar vacío. Por favor ingrese información válida.")
    @NotNull(message = "El campo 'nombre' de proveedores, exige el ingreso de información.")
    @Min(4)
    @Max(100)
    private String nombre;

    @Column(name = "contacto", columnDefinition = "BIGINT UNSIGNED", nullable = false)
    @NotNull(message = "El campo 'contacto' de proveedores, exige el ingreso de información.")
    @Min(2)
    @Max(50)
    private int contacto;

    @Column(name = "email", columnDefinition = "VARCHAR(100)", nullable = false)
    @NotBlank(message =  "El campo 'email' de proveedores no puede estar vacío. Por favor ingrese información válida.")
    @NotNull(message = "El campo 'email' de proveedores, exige el ingreso de información.")
    @Min(4)
    @Max(100)
    private String email;

    @Column(name = "telefono", columnDefinition = "BIGINT", nullable = false)
    @NotNull(message = "El campo 'telefono' de proveedores, exige el ingreso de información.")
    @Min(2)
    @Max(200)
    private int telefono;

    @ManyToOne
    @JoinColumn(name = "ciudad_id", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "El campo 'ciudad_id' de proveedores, exige el ingreso de información.")
    private Ciudad ciudad;


    public Proveedor() {

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


    public int getContacto() {
        return contacto;
    }
    public void setContacto(int contacto) {
        this.contacto = contacto;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    public Ciudad getCiudad() {
        return ciudad;
    }
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}
