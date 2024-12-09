package com.anabelenhernandez.despensainteligente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anabelenhernandez.despensainteligente.model.Producto;
import com.anabelenhernandez.despensainteligente.service.ProductoService;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    // Endpoint para obtener productos próximos a caducar
    @GetMapping("/proximos-a-caducar")
    public List<Producto> obtenerProductosProximosACaducar() {
        return productoService.obtenerProductosProximosACaducar();
    }
}
