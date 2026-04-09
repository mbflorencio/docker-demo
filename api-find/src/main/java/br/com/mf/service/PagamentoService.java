package br.com.mf.service;

import br.com.mf.model.Pagamento;
import br.com.mf.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagamentoService {
    @Autowired
    PagamentoRepository repo;

    public Pagamento save(Pagamento pagamento){
        return repo.save(pagamento);
    }
    public Pagamento findById(Long idpagamento){
        return repo.findById(idpagamento).get();
    }
    public List<Pagamento> findByCpf(String cpf){
        return repo.findByCpf(cpf);
    }
    public List<Pagamento> findAll(){
        List<Pagamento> list = repo.findAll();
        return list;
    }
}