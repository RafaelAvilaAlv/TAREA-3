package com.proyecto.api.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.proyecto.api.entity.Cliente;

public interface ClienteRepositoryDao extends MongoRepository<Cliente, String> {

}
