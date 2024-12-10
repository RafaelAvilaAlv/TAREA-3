package com.proyecto.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.proyecto.api.entity.Pedido;
import com.proyecto.api.services.PedidoService;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
@CrossOrigin(origins = "*")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    // Listar todos los pedidos
    @GetMapping
    public List<Pedido> listar() {
        return pedidoService.findAll();
    }

    // Buscar un pedido por su ID
    @GetMapping("/{id}")
    public Pedido buscarPorId(@PathVariable String id) {
        return pedidoService.findById(id);
    }

    // Crear un nuevo pedido
    @PostMapping
    public Pedido crear(@RequestBody Pedido pedido) {
        return pedidoService.save(pedido);
    }

    // Actualizar un pedido existente
    @PutMapping("/{id}")
    public Pedido actualizar(@PathVariable String id, @RequestBody Pedido pedido) {
        pedido.setId(id);
        return pedidoService.save(pedido);
    }

    // Eliminar un pedido por su ID
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        pedidoService.delete(id);
    }
}
