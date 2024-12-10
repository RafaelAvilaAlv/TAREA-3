package com.proyecto.api.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.proyecto.api.entity.Pedido;

public interface PedidoRepositoryDao extends MongoRepository<Pedido, String>{

}
