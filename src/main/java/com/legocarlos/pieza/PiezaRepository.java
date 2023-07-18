package com.legocarlos.pieza;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PiezaRepository extends JpaRepository<Pieza, Long> {
    List<Pieza> findByReferenciaContainsOrNombreContains(String keyword, String keyword1);
}
