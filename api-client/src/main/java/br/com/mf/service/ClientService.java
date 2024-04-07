package br.com.mf.service;

import br.com.mf.model.Client;
import br.com.mf.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired ClientRepository repo;

    public Client save(Client client){
        return repo.save(client);
    }
    public Client findById(Long idClient){
        return repo.findById(idClient).get();
    }
    public List<Client> findAll(){
        List<Client> list = repo.findAll();
        return list;
    }
}
