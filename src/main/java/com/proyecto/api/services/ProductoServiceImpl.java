package com.proyecto.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.api.dao.ProductoRepositoryDao;
import com.proyecto.api.entity.Producto;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepositoryDao repository;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Producto save(Producto producto) {
        return repository.save(producto);
    }

    @Override
    @Transactional(readOnly = true)
    public Producto findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(String id) {
        repository.deleteById(id);
    }
}
