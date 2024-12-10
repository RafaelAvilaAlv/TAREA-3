package com.proyecto.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.proyecto.api.entity.Cliente;
import com.proyecto.api.services.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    // Listar todos los clientes
    @GetMapping
    public List<Cliente> listar() {
        return clienteService.findAll();
    }

    // Buscar un cliente por su ID
    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable String id) {
        return clienteService.findById(id);
    }

    // Crear un nuevo cliente
    @PostMapping
    public Cliente crear(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    // Actualizar un cliente existente
    @PutMapping("/{id}")
    public Cliente actualizar(@PathVariable String id, @RequestBody Cliente cliente) {
        cliente.setId(id);
        return clienteService.save(cliente);
    }

    // Eliminar un cliente por su ID
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        clienteService.delete(id);
    }
}
