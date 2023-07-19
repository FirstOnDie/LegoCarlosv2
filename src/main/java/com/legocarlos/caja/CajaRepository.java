package com.legocarlos.caja;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CajaRepository extends JpaRepository<Caja, Long> {
    List<Caja> findByNombreContains(String keyword);
}
