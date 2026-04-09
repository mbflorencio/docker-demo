package br.com.mf.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="cpf")
    private String cpf;
    @Column(name="name")
    private String nome;
    @Column(name="email")
    private String email;
    @Column(name="telefone")
    private String telefone;
    @Column(name="rua")
    private String rua;
    @Column(name="cidade")
    private String cidade;
    @Column(name="estado")
    private String estado;
    @Column(name="cep")
    private String cep;
    @Column(name="pais")
    private String pais;



}
