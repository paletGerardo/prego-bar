package com.ar.maxger.pregobar.controller;

import com.ar.maxger.pregobar.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class CategoriaController {
    @Autowired
    @Qualifier("categoriaServiceImpl")
    CategoriaService categoriaService;

    @GetMapping("categorias")
    public ModelAndView listarCategorias(){

        ModelAndView mav = new ModelAndView("categorias");
        mav.addObject("lista", categoriaService.listAll());
        return mav;
    }
}
