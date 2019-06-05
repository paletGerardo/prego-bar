package com.ar.angema.menuapp.categoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired(required=true)
    @Qualifier(value = "CategoriaJpaRopesitory")
    CategoriaJpaRepository categoriaJpaRepository;

    public List<Categoria>  mostrarTodo() {
        return categoriaJpaRepository.findAll();
    }

    public Categoria        agregar(Categoria categoria) {
        return categoriaJpaRepository.save(categoria);
    }

    public Categoria        actualizar(Categoria categoria) {
        return categoriaJpaRepository.save(categoria);
    }

    public void             borrar(Categoria categoria) { categoriaJpaRepository.delete(categoria); }

    public Categoria        buscar(String id) {
        return categoriaJpaRepository.findById(Long.parseLong(id));
    }
}
