package com.proyecto.api.services;

import java.util.List;
import com.proyecto.api.entity.Cliente;

public interface ClienteService {
    List<Cliente> findAll();
    Cliente save(Cliente cliente);
    Cliente findById(String id);
    void delete(String id);
}
