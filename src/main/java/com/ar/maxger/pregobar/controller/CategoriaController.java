package com.ar.maxger.pregobar.controller;

import com.ar.maxger.pregobar.entity.Categoria;
import com.ar.maxger.pregobar.service.CategoriaService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class CategoriaController {

    private static final Log LOG = LogFactory.getLog(CategoriaController.class);

    @Autowired
    @Qualifier("categoriaServiceImpl")
    CategoriaService categoriaService;

    @GetMapping("/listar")
    public String irCategorias(){
        return "index";
    }

    @GetMapping("categorias")
    public ModelAndView listarCategorias(){
        LOG.info("@GetMapping(\"categorias\")");
        ModelAndView mav = new ModelAndView("categorias");
        LOG.info("devolviendo lista " + categoriaService.listAll() );
        mav.addObject("lista", categoriaService.listAll());
        return mav;
    }

    @GetMapping("formAgregarCategoria")
    public ModelAndView formCategoria(){
        ModelAndView mav = new ModelAndView("formAgregarCategoria");
        Categoria categoria =new Categoria();
        mav.addObject("categoria", categoria);
        return mav;
    }

    @GetMapping("agregarCategoria")
    public String agregarCategoria(@ModelAttribute("categoria") Categoria categoria){
        categoriaService.addCategoria(categoria);
        return "redirect:/categorias";

    }
}
