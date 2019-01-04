package com.ar.maxger.pregobar.repository;

import com.ar.maxger.pregobar.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("productoJpaRepository")
public interface ProductoJpaRepository extends JpaRepository<Producto, Serializable> {
    public abstract Producto findByNombre(String nombre);
    public abstract Producto findById(long id);

}
