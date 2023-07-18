package com.legocarlos.pieza;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PiezaService {
    private final PiezaRepository piezaRepository;

    public List<Pieza> getAllpieza() {
        return piezaRepository.findAll();
    }

    public Pieza getpiezaById(Long id) {
        return piezaRepository.findById(id).orElse(null);
    }

    public Pieza savepieza(Pieza pieza) {
        return piezaRepository.save(pieza);
    }

    public void deletepieza(Long id) {
        piezaRepository.deleteById(id);
    }

    /*public List<pieza> searchpieza(String keyword) {
        return piezaRepository.findByReferenciaContainsOrNombreContains(keyword, keyword);
    }*/
}