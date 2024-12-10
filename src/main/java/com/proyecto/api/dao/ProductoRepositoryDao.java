package com.proyecto.api.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.proyecto.api.entity.Producto;

public interface ProductoRepositoryDao extends MongoRepository<Producto, String> {

}
