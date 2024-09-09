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
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "ventas")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT UNSIGNED")
    private long id;

    @Column(name = "fecha", columnDefinition = "DATE", nullable = false)
    @NotBlank(message =  "El campo 'fecha' de venta no puede estar vacío. Por favor ingrese información válida.")
    @NotNull(message = "El campo 'fecha' de venta, exige el ingreso de información.")
    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name = "cliente_id", columnDefinition = "INT UNSIGNED")
    @NotNull(message = "El campo 'cliente_id' de venta, exige el ingreso de información.")
    private Cliente cliente;


    public Venta() {

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


    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}