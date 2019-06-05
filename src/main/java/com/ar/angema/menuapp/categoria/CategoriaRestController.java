package com.ar.angema.menuapp.categoria;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaRestController {

    @Autowired (required=true)
    CategoriaService categoriaService;

    private static final Log LOG = LogFactory.getLog(CategoriaRestController.class);

    @GetMapping(value="/", headers="Accept=application/json")
    public ModelMap mostrarTodo() {
        List<Categoria> lista=categoriaService.mostrarTodo();
        ModelMap model = new ModelMap();
        model.put("contenido", lista);
        return model;

    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Categoria> getUserById(@PathVariable("id") String id) {

        Categoria categoria = categoriaService.buscar(id);
        if (categoria == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(categoria, HttpStatus.OK);
    }



}

