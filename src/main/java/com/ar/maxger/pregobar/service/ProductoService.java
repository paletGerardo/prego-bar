package com.ar.maxger.pregobar.service;

import com.ar.maxger.pregobar.entity.Producto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductoService {
    public abstract List<Producto> listAll();
    public abstract Producto addProducto(Producto producto);
    public abstract void removeProducto(String id);
    public abstract Producto updateProducto(Producto producto);
    public abstract Producto findById(String id);
    public abstract List<Producto> findByIdCategoria(String id);
}
