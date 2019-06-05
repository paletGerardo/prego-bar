package com.ar.angema.menuapp.categoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("CategoriaJpaRopesitory")
public interface CategoriaJpaRepository extends JpaRepository<Categoria, Serializable> {
    public abstract Categoria findByNombre(String nombre);
    public abstract Categoria findById(Long id);
}
