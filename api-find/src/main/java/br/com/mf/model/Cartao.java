package br.com.mf.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cartao")
public class Cartao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="cpf")
    private String cpf;
    @Column(name="limite")
    private Long limite;
    @Column(name="numero")
    private String numero;
    @Column(name="data_validade")
    private String data_validade;
    @Column(name="cvv")
    private String cvv;

}