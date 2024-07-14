
package com.lfcm.app01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaController {
    
    @GetMapping
    public String TestService(){
        return "Test ok del servicio";
    }
    
    @GetMapping ("/pedirnombre/{nombre}")
    public String PedirNombre(@PathVariable String nombre){
        return "Hola: " + nombre;
    }
    
}
