package br.com.mf.controllers;


import br.com.mf.view.Autenticar;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class AuthController {





    @PostMapping("/autenticacao")
    public Map<String, String> login(@RequestBody Autenticar authRequest) throws Exception {


        Map<String, String> response = new HashMap<>();
        response.put("token", "dsfdsfdsfdfdsfdfasdfs");
        return response;
    }
}
