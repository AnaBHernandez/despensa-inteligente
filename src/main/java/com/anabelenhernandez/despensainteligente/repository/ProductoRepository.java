package com.anabelenhernandez.despensainteligente.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anabelenhernandez.despensainteligente.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    
    // Método personalizado para obtener productos cuya fecha de caducidad esté entre hoy y los próximos 3 días
    List<Producto> findByFechaCaducidadBetween(Date startDate, Date endDate);
}
