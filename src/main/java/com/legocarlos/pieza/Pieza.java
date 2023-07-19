package com.legocarlos.pieza;

import com.legocarlos.caja.Caja;
import com.legocarlos.color.Color;
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
    @ManyToOne
    @JoinColumn(name="nombre")
    private Color color;
    private Integer unidades;
    @ManyToOne
    @JoinColumn(name="caja")
    private Caja caja;

}