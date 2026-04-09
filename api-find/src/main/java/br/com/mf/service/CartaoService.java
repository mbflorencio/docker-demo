package br.com.mf.service;

import br.com.mf.model.Cartao;
import br.com.mf.repository.CartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartaoService {
    @Autowired
    CartaoRepository repo;

    public Cartao save(Cartao cartao){
        return repo.save(cartao);
    }
    public Cartao findById(Long idCartao){
        return repo.findById(idCartao).get();
    }
    public List<Cartao> findAll(){
        List<Cartao> list = repo.findAll();
        return list;
    }
}

