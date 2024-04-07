package br.com.mf.controllers;

import br.com.mf.model.Client;
import br.com.mf.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController  {

    @Autowired ClientService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Client getClientId(@PathVariable Long idClient){
        return service.findById(idClient);
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Client> getClients(){
        return service.findAll();
    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public Client salvar(Client client){
        return service.save(client);
    }
}
