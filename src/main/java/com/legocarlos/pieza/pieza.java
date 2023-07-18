package com.legocarlos.pieza;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "legocarlos")
public class pieza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String referencia;
    private String nombre;
    private String foto;
    private Integer unidades;
    private String caja;

}