package br.com.mf.repository;

import br.com.mf.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento,Long> {
    public List<Pagamento> findByCpf(String cpf);
}