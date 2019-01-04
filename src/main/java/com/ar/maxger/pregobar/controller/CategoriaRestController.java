package com.ar.maxger.pregobar.controller;

import com.ar.maxger.pregobar.entity.Categoria;
import com.ar.maxger.pregobar.service.CategoriaService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categoria/rest")
public class CategoriaRestController {

    @Autowired
    @Qualifier("categoriaServiceImpl")
    CategoriaService categoriaService;

    private static final Log LOG = LogFactory.getLog(CategoriaRestController.class);

    @GetMapping(value="/listar", headers="Accept=application/json")
    public List<Categoria> getAll() {
        LOG.info("CategoriaRestController: /listar => categoriaService.listAll()");
        List<Categoria> tasks=categoriaService.listAll();
        return tasks;

    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Categoria> getUserById(@PathVariable("id") String id) {
        LOG.info("CategoriaRestController: /{id} => categoriaService.findById(id) => id: " + id);
        Categoria categoria = categoriaService.findById(id);
        if (categoria == null) {
            return new ResponseEntity<Categoria>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Categoria>(categoria, HttpStatus.OK);
    }



}

