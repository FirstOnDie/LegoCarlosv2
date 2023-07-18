package com.legocarlos.pieza;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface piezaRepository extends JpaRepository<pieza, Long> {
    //List<pieza> findByReferenciaContainsOrNombreContains(String keyword, String keyword1);
}
