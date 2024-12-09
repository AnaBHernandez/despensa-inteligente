package com.anabelenhernandez.despensainteligente.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
public class InventarioProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInventarioProducto;

    @NotNull(message = "El inventario no puede ser nulo")
    @ManyToOne
    @JoinColumn(name = "idInventario", nullable = false)  
    private Inventario inventario;

    @NotNull(message = "El producto no puede ser nulo")
    @ManyToOne
    @JoinColumn(name = "idProducto", nullable = false)  
    private Producto producto;

    @Min(value = 1, message = "La cantidad debe ser mayor que 0")
    private int cantidad;

    // Constructor vacío necesario para JPA
    public InventarioProducto() {}

    // Constructor con parámetros
    public InventarioProducto(Inventario inventario, Producto producto, int cantidad) {
        this.inventario = inventario;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    // Getters y setters
    public int getIdInventarioProducto() {
        return idInventarioProducto;
    }

    public void setIdInventarioProducto(int idInventarioProducto) {
        this.idInventarioProducto = idInventarioProducto;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
