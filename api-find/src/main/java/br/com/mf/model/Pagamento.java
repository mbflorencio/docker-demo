package br.com.mf.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pagamento")
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "valor")
    private Double valor;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "data_validade")
    private String data_validade;
    @Column(name = "numero")
    private String numero;
    @Column(name = "ccv")
    private String ccv;
}
