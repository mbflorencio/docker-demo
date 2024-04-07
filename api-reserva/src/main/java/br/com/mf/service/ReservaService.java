package br.com.mf.service;


import br.com.mf.model.Reserva;

import br.com.mf.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {
    @Autowired
    ReservaRepository repo;

    public Reserva save(Reserva reserva){
        return repo.save(reserva);
    }
    public Reserva findById(Long idReserva){
        return repo.findById(idReserva).get();
    }
    public List<Reserva> findAll(){
        List<Reserva> list = repo.findAll();
        return list;
    }
}
