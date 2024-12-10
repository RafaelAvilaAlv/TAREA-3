package com.proyecto.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.proyecto.api.entity.Producto;
import com.proyecto.api.services.ProductoService;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "*") // Permite solicitudes desde cualquier origen
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    // Listar todos los productos
    @GetMapping
    public List<Producto> listar() {
        return productoService.findAll();
    }

    // Buscar un producto por su ID
    @GetMapping("/{id}")
    public Producto buscarPorId(@PathVariable String id) {
        return productoService.findById(id);
    }

    // Crear un nuevo producto
    @PostMapping
    public Producto crear(@RequestBody Producto producto) {
        return productoService.save(producto);
    }

    // Actualizar un producto existente
    @PutMapping("/{id}")
    public Producto actualizar(@PathVariable String id, @RequestBody Producto producto) {
        producto.setId(id);
        return productoService.save(producto);
    }

    // Eliminar un producto por su ID
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        productoService.delete(id);
    }
}
