package com.proyecto.api.services;

import java.util.List;

import com.proyecto.api.entity.Producto;

public interface ProductoService {

	  List<Producto> findAll();
	    Producto save(Producto producto);
	    Producto findById(String id);
	    void delete(String id);
}
