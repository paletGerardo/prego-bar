package com.ar.maxger.pregobar.controller;

import com.ar.maxger.pregobar.entity.Categoria;
import com.ar.maxger.pregobar.entity.Producto;
import com.ar.maxger.pregobar.service.CategoriaService;
import com.ar.maxger.pregobar.service.ProductoService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    private static final Log LOG = LogFactory.getLog(CategoriaController.class);

    @Autowired
    @Qualifier("categoriaServiceImpl")
    CategoriaService categoriaService;

    @Autowired
    @Qualifier("productoServiceImpl")
    ProductoService productoService;

    @GetMapping("/index")
    public ModelAndView home(){
        LOG.info("HomeController: new ModelAndView(\"index\")");
        ModelAndView modelAndView = new ModelAndView("index");

        LOG.info("HomeController: categoriaService.listAll()");
        List<Categoria> categorias = categoriaService.listAll();
        modelAndView.addObject("categorias", categorias);

        List<Producto> productos = productoService.listAll();
        modelAndView.addObject("productos", productos);

        return modelAndView;
    }
}
