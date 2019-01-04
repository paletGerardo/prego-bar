package com.ar.maxger.pregobar.controllerRest;

import com.ar.maxger.pregobar.entity.Producto;
import com.ar.maxger.pregobar.service.ProductoService;
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
@RequestMapping("/rest")
public class ProductoRestController {

    @Autowired
    @Qualifier("productoServiceImpl")
    ProductoService productoService;

    @GetMapping(value = "/productos", headers = "Accept=application/json")
    public List<Producto> getAll(){
        List<Producto> lista = productoService.listAll();
        return lista;
    }

    @GetMapping(value = "/productos/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Producto> getById(@PathVariable("id") String id){
        Producto producto = productoService.findById(id);
        return new ResponseEntity<Producto>(producto, HttpStatus.OK);
    }

}
