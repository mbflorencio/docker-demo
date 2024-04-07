package br.com.mf.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id = 0;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
}
