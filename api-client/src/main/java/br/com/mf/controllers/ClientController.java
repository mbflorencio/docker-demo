package br.com.mf.controllers;

import br.com.mf.model.Client;
import br.com.mf.service.ClientService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
@CircuitBreaker(name = "clientCircuitService", fallbackMethod = "fallback")
public class ClientController  {

    @Autowired ClientService service;

    @GetMapping("/{id}")
    public Client getClientId(@PathVariable Long id){
        if (id == -1) {
            throw new RuntimeException("Client service unavailable");
        }
        return service.findById(id);
    }
    public Client fallback(Long id, Throwable throwable) {
        System.out.println("Fallback called due to: " + throwable.getMessage());
        return new Client(id, "Fallback Client","Fallback");
    }

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Client salvar(@RequestBody Client client) {
        return service.save(client);
    }
}
