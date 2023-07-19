package com.legocarlos.color;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "colores")
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;


}