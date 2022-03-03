package com.machava.machava.recursos;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/categorias")

public class CategoriaRecurso {
    
    @RequestMapping(method= RequestMethod.GET)
    public String listar(){
return "esta funcionar";


    }

}
