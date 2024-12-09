package com.anabelenhernandez.despensainteligente.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Alerta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAlerta;

    @NotNull(message = "El nombre de la alerta no puede ser nulo")
    @Size(min = 2, max = 100, message = "El nombre de la alerta debe tener entre 2 y 100 caracteres")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

    @NotNull(message = "La fecha de creación no puede ser nula")
    private String fechaCreacion;

    // Constructor vacío necesario para JPA
    public Alerta() {}

    // Constructor con parámetros
    public Alerta(String nombre, Usuario usuario, String fechaCreacion) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.fechaCreacion = fechaCreacion;
    }

    // Getters y setters
    public int getIdAlerta() {
        return idAlerta;
    }

    public void setIdAlerta(int idAlerta) {
        this.idAlerta = idAlerta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
