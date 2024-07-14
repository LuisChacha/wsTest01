
package com.lfcm.app01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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
    
    @GetMapping ("/pediredad")
    public String PedirNombre(@RequestParam int edad){
        return "Hola: " + edad;
    }
    
    
    @GetMapping ("/presentarse")
    public String pedirnombreedad(@RequestParam String nombre,
            @RequestParam int edad){
        return "Hola me llamo: " + nombre + " y mi edad es: " + edad;
    }
    
    
    
}
