package br.com.mf.service;

import br.com.mf.model.Restaurante;
import br.com.mf.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestauranteService {
    @Autowired
    RestauranteRepository repo;

    public Restaurante save(Restaurante restaurante){
        return repo.save(restaurante);
    }
    public Restaurante findById(Long idRestaurante){
        return repo.findById(idRestaurante).get();
    }
    public List<Restaurante> findAll(){
        List<Restaurante> list = repo.findAll();
        return list;
    }
}
