package com.ar.maxger.pregobar.repository;

import com.ar.maxger.pregobar.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("CategoriaJpaRopesitory")
public interface CategoriaJpaRepository extends JpaRepository<Categoria, Serializable> {
    public abstract Categoria findByNombre(String nombre);
    public abstract Categoria findById(long id);
}
