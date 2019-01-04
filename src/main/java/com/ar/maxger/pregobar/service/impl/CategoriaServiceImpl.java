package com.ar.maxger.pregobar.service.impl;

import com.ar.maxger.pregobar.entity.Categoria;
import com.ar.maxger.pregobar.repository.CategoriaJpaRepository;
import com.ar.maxger.pregobar.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("categoriaServiceImpl")
public class CategoriaServiceImpl  implements CategoriaService {

    @Autowired
    @Qualifier("CategoriaJpaRopesitory")
    CategoriaJpaRepository categoriaJpaRepository;

    @Override
    public List<Categoria> listAll() {
        return categoriaJpaRepository.findAll();
    }

    @Override
    public Categoria addCategoria(Categoria categoria) {
        return categoriaJpaRepository.save(categoria);
    }

    @Override
    public int removeCategoria(Categoria categoria) {
        categoriaJpaRepository.delete(categoria);
        return 0;
    }

    @Override
    public Categoria updateCategoria(Categoria categoria) {
        return categoriaJpaRepository.save(categoria);
    }

    @Override
    public Categoria findById(String id) {
        return categoriaJpaRepository.findById(Long.parseLong(id));
    }
}
