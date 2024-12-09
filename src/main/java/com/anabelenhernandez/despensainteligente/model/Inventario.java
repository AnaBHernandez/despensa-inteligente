package com.anabelenhernandez.despensainteligente.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInventario;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;  // Relación con Usuario

    @OneToMany(mappedBy = "inventario", fetch = FetchType.LAZY)
    private List<InventarioProducto> inventarioProductos;

    // Constructor vacío necesario para JPA
    public Inventario() {}

    // Constructor con parámetros
    public Inventario(List<InventarioProducto> inventarioProductos) {
        this.inventarioProductos = inventarioProductos;
    }

    // Getters y setters
    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public List<InventarioProducto> getInventarioProductos() {
        return inventarioProductos;
    }

    public void setInventarioProductos(List<InventarioProducto> inventarioProductos) {
        this.inventarioProductos = inventarioProductos;
    }
}
