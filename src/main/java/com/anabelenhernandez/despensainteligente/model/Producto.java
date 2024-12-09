package com.anabelenhernandez.despensainteligente.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;

    @NotNull(message = "El nombre del producto no puede ser nulo")
    @Size(min = 2, max = 100, message = "El nombre debe tener entre 2 y 100 caracteres")
    private String nombre;

    @NotNull(message = "La marca no puede ser nula")
    private String marca;

    @OneToMany(mappedBy = "producto")
    private List<InventarioProducto> inventarioProductos;

    @Temporal(TemporalType.DATE)
    private Date fechaCaducidad;

    // Constructor vacío necesario para JPA
    public Producto() {}

    // Constructor con parámetros
    public Producto(String nombre, String marca, Date fechaCaducidad) {
        this.nombre = nombre;
        this.marca = marca;
        this.fechaCaducidad = fechaCaducidad;
    }

    // Getters y setters
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public List<InventarioProducto> getInventarioProductos() {
        return inventarioProductos;
    }

    public void setInventarioProductos(List<InventarioProducto> inventarioProductos) {
        this.inventarioProductos = inventarioProductos;
    }
}
