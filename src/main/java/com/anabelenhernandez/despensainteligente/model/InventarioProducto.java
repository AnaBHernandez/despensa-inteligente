package com.anabelenhernandez.despensainteligente.model;

import javax.persistence.*;

@Entity
public class InventarioProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInventarioProducto;

    @ManyToOne
    @JoinColumn(name = "idInventario")
    private Inventario inventario;

    @ManyToOne
    @JoinColumn(name = "idProducto")
    private Producto producto;

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
