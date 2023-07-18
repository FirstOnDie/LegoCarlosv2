package com.legocarlos.pieza;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "legocarlos")
public class Pieza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String referencia;
    private String nombre;
    private String foto;
    private Integer unidades;
    private String caja;

}