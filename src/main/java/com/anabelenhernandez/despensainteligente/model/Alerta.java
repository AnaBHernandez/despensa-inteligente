package com.anabelenhernandez.despensainteligente.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Alerta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAlerta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idInventario")
    private Inventario inventario;

    @NotNull(message = "El mensaje no puede ser nulo")
    @Size(min = 5, message = "El mensaje debe tener al menos 5 caracteres")
    private String mensaje;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlerta;

    // Constructor vacío necesario para JPA
    public Alerta() {}

    // Constructor con parámetros
    public Alerta(Inventario inventario, String mensaje, Date fechaAlerta) {
        this.inventario = inventario;
        this.mensaje = mensaje;
        this.fechaAlerta = fechaAlerta;
    }

    // Getters y setters
    public int getIdAlerta() {
        return idAlerta;
    }

    public void setIdAlerta(int idAlerta) {
        this.idAlerta = idAlerta;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getFechaAlerta() {
        return fechaAlerta;
    }

    public void setFechaAlerta(Date fechaAlerta) {
        this.fechaAlerta = fechaAlerta;
    }
}
