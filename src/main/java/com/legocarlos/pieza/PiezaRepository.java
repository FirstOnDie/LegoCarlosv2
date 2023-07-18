package com.legocarlos.pieza;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PiezaRepository extends JpaRepository<Pieza, Long> {
    //List<pieza> findByReferenciaContainsOrNombreContains(String keyword, String keyword1);
}
