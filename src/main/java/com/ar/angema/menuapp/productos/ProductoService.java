package com.ar.angema.menuapp.productos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productoServiceImpl")
public class ProductoService implements ProductoServiceInterface {
    @Autowired
    @Qualifier("productoJpaRepository")
    ProductoJpaRepository productoJpaRepository;

    @Override
    public List<Producto> listAll() {

        return productoJpaRepository.findAll();
    }

    @Override
    public Producto addProducto(Producto producto) {
        return null;
    }

    @Override
    public void removeProducto(String id) {

    }

    @Override
    public Producto updateProducto(Producto producto) {
        return null;
    }

    @Override
    public Producto findById(String id) {

        return productoJpaRepository.findById(Long.parseLong(id));
    }

    @Override
    public List<Producto> findByIdCategoria(String id) {
        return productoJpaRepository.findByIdCategoria(id);
    }
}
