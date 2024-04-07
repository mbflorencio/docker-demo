package br.com.mf.controllers;

import br.com.mf.model.Restaurante;
import br.com.mf.service.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController  {

    @Autowired
    RestauranteService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Restaurante getRestauranteId(@PathVariable Long idRestaurante){
        return service.findById(idRestaurante);
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Restaurante> getRestaurante(){
        return service.findAll();
    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public Restaurante salvar(Restaurante restaurante){
        return service.save(restaurante);
    }
}
