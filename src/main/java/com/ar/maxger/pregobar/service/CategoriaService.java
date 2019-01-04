package com.ar.maxger.pregobar.service;

import com.ar.maxger.pregobar.entity.Categoria;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("cursoService")
public interface CategoriaService {
    public abstract List<Categoria> listAll();
    public abstract Categoria addCategoria(Categoria categoria);
    public abstract int removeCategoria(Categoria categoria);
    public abstract Categoria updateCategoria(Categoria categoria);
    public abstract Categoria findById(String id);
}
