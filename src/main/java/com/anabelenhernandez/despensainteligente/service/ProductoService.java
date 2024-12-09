package com.anabelenhernandez.despensainteligente.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anabelenhernandez.despensainteligente.model.Producto;
import com.anabelenhernandez.despensainteligente.repository.ProductoRepository;
@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    // Método para obtener productos que están próximos a caducar (en los próximos 3 días)
    public List<Producto> obtenerProductosProximosACaducar() {
        LocalDate hoy = LocalDate.now();  // Fecha de hoy
        LocalDate fechaLimite = hoy.plus(3, ChronoUnit.DAYS);  // Sumar 3 días a la fecha de hoy

        // Convertir LocalDate a Date para que JPA pueda entenderlo
        Date fechaHoy = java.sql.Date.valueOf(hoy);
        Date fechaLimiteDate = java.sql.Date.valueOf(fechaLimite);

        return productoRepository.findByFechaCaducidadBetween(fechaHoy, fechaLimiteDate);
    }
}
