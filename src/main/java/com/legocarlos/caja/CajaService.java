package com.legocarlos.caja;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CajaService {
    private final CajaRepository cajaRepository;

    public List<Caja> getAll() {
        return cajaRepository.findAll();
    }

    public Caja getById(Long id) {
        return cajaRepository.findById(id).orElse(null);
    }

    public Caja save(Caja caja) {
        return cajaRepository.save(caja);
    }

    public void delete(Long id) {
        cajaRepository.deleteById(id);
    }

    public List<Caja> search(String keyword) {
        return cajaRepository.findByNombreContains(keyword);
    }
}