package br.com.mf.controllers;


import br.com.mf.model.Reserva;

import br.com.mf.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reserva")
public class ReservaController  {

    @Autowired
    ReservaService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Reserva getReservaId(@PathVariable("id") Long id) {
        return service.findById(id);
    }
    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Reserva> getReservas(){
        return service.findAll();
    }
    @PostMapping(value = "/salvar", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Reserva salvar(@RequestBody Reserva reserva) {
        return service.save(reserva);
    }
}
