package com.legocarlos.caja;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cajas")
public class Caja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;


}