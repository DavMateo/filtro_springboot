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
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT UNSIGNED")
    private long id;

    @Column(name = "nombre", columnDefinition = "VARCHAR(100)", nullable = false)
    @NotBlank(message =  "El campo 'nombre' de clientes no puede estar vacío. Por favor ingrese información válida.")
    @NotNull(message = "El campo 'nombre' de clientes, exige el ingreso de información.")
    @Min(2)
    @Max(100)
    private String nombre;

    @Column(name = "email", columnDefinition = "VARCHAR(100)", nullable = false)
    @NotBlank(message =  "El campo 'email' de clientes no puede estar vacío. Por favor ingrese información válida.")
    @NotNull(message = "El campo 'email' de clientes, exige el ingreso de información.")
    @Min(5)
    @Max(100)
    private String email;

    @Column(name = "telefono", columnDefinition = "BIGINT UNSIGNED", nullable = false)
    @NotNull(message = "El campo 'telefono' de clientes, exige el ingreso de información.")
    @Min(4)
    private int telefono;

    @Column(name = "password", columnDefinition = "VARCHAR(100)", nullable = false)
    @NotBlank(message =  "El campo 'password' de clientes no puede estar vacío. Por favor ingrese información válida.")
    @NotNull(message = "El campo 'password' de clientes, exige el ingreso de información.")
    @Min(8)
    @Max(100)
    private String password;

    @ManyToOne
    @JoinColumn(name = "ciudad_id", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "El campo 'ciudad_id' de clientes, exige el ingreso de información.")
    private Ciudad ciudad;


    public Cliente() {

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

    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    public Ciudad getCiudad() {
        return ciudad;
    }
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}