package com.proyecto.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.api.dao.PedidoRepositoryDao;
import com.proyecto.api.entity.Pedido;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoRepositoryDao repository;

    @Override
    @Transactional(readOnly = true)
    public List<Pedido> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Pedido save(Pedido pedido) {
        return repository.save(pedido);
    }

    @Override
    @Transactional(readOnly = true)
    public Pedido findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(String id) {
        repository.deleteById(id);
    }
}
