package com.filtro.springfiltro.domain.dto;

import java.time.LocalDateTime;

import com.filtro.springfiltro.domain.entity.Cliente;

public class VentaDto {
    private long id;
    private LocalDateTime fecha;
    private Cliente cliente;


    public VentaDto() {

    }

    public VentaDto(long id, LocalDateTime fecha, Cliente cliente) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
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