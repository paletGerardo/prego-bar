package com.ar.maxger.pregobar.repository;

import com.ar.maxger.pregobar.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("productoJpaRepository")
public interface ProductoJpaRepository extends JpaRepository<Producto, Serializable> {
   Producto findByNombre(String nombre);
   Producto findById(long id);

    List<Producto> findByIdCategoria(String id);
}
