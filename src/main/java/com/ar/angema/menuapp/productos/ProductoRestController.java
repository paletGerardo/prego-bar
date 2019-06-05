package com.ar.angema.menuapp.productos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoRestController {

    @Autowired
    @Qualifier("productoServiceImpl")
    ProductoServiceInterface productoService;

    @GetMapping(value = "/", headers = "Accept=application/json")
    public List<Producto> getAll(){
        List<Producto> lista = productoService.listAll();
        return lista;
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Producto> getById(@PathVariable("id") String id){
        Producto producto = productoService.findById(id);
        return new ResponseEntity<Producto>(producto, HttpStatus.OK);
    }

    @GetMapping(value = "/categoria/{id}", headers = "Accept=application/json")
    public List<Producto> getByIdCategoria(@PathVariable("id") String id){
        List<Producto> lista = productoService.findByIdCategoria(id);
        return lista;
    }

    @PostMapping(value ="guardar/pedido")
    public void guardarPedido(){

    }

}
