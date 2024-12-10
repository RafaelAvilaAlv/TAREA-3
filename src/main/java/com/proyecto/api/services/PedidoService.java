package com.proyecto.api.services;

import java.util.List;
import com.proyecto.api.entity.Pedido;

public interface PedidoService {
    List<Pedido> findAll();
    Pedido save(Pedido pedido);
    Pedido findById(String id);
    void delete(String id);
}
