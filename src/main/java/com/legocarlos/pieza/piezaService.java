package com.legocarlos.pieza;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class piezaService {
    private final piezaRepository piezaRepository;

    public List<pieza> getAllpieza() {
        return piezaRepository.findAll();
    }

    public pieza getpiezaById(Long id) {
        return piezaRepository.findById(id).orElse(null);
    }

    public pieza savepieza(pieza pieza) {
        return piezaRepository.save(pieza);
    }

    public void deletepieza(Long id) {
        piezaRepository.deleteById(id);
    }

    /*public List<pieza> searchpieza(String keyword) {
        return piezaRepository.findByReferenciaContainsOrNombreContains(keyword, keyword);
    }*/
}