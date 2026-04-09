package br.com.mf.controllers;

import br.com.mf.model.Cartao;
import br.com.mf.model.Client;
import br.com.mf.model.Pagamento;
import br.com.mf.service.CartaoService;
import br.com.mf.service.ClientService;
import br.com.mf.service.PagamentoService;
import br.com.mf.view.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientController  {

    @Autowired ClientService clientService;
    @Autowired CartaoService cartaoService;
    @Autowired PagamentoService pagamentoService;

    @PostMapping("/cliente")
    public Client cliente(@RequestBody ClienteView cliente){
        Client c = new Client();
        c.setCpf(cliente.getCpf());
        c.setNome(cliente.getNome());
        c.setEmail(cliente.getEmail());
        c.setTelefone(cliente.getTelefone());
        c.setRua(cliente.getRua());
        c.setCep(cliente.getCep());
        c.setEstado(cliente.getEstado());
        c.setPais(cliente.getPais());
        c.setCidade(cliente.getCidade());
        return clientService.save(c);
    }
    @PostMapping("/cartao")
    public Cartao cliente(@RequestBody CartaoView cartaoView){
        Cartao cartao = new Cartao();

        cartao.setNumero(cartaoView.getNumero());
        cartao.setLimite(cartaoView.getLimite());
        cartao.setCvv(cartaoView.getCvv());
        cartao.setData_validade(cartaoView.getData_validade());
        cartao.setCpf(cartaoView.getCpf());
        return cartaoService.save(cartao);
    }
    @PostMapping("/pagamentos")
    public Pagamento pagamento(@RequestBody PagamentoView pagamentoView)
    {
        Pagamento pagamento = new Pagamento();
        pagamento.setValor(pagamentoView.getValor());
        pagamento.setCcv(pagamentoView.getCcv());
        pagamento.setCpf(pagamentoView.getCpf());

        pagamento.setNumero(pagamentoView.getNumero());
        pagamento.setData_validade(pagamentoView.getData_validade());
        return pagamentoService.save(pagamento);

    }
    @GetMapping("/pagamentos/cliente/{chave}")
     public List<Pagamento> getPagamento(@PathVariable String chave)
    {
        return pagamentoService.findByCpf(chave);
    }

}
