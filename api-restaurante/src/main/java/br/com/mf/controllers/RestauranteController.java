package br.com.mf.controllers;

import br.com.mf.model.Restaurante;
import br.com.mf.service.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController  {

    @Autowired
    RestauranteService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Restaurante getRestauranteId(@PathVariable("id") Long id) {
        return service.findById(id);
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Restaurante> getRestaurante(){
        return service.findAll();
    }
    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Restaurante salvar(@RequestBody Restaurante restaurante) {
        return service.save(restaurante);
    }
}
