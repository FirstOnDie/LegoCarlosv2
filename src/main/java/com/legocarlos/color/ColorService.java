package com.legocarlos.color;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ColorService {
    private final ColorRepository colorRepository;

    public List<Color> getAll() {
        return colorRepository.findAll();
    }

    public Color getById(Long id) {
        return colorRepository.findById(id).orElse(null);
    }

    public Color save(Color color) {
        return colorRepository.save(color);
    }

    public void delete(Long id) {
        colorRepository.deleteById(id);
    }

    public List<Color> search(String keyword) {
        return colorRepository.findByNombreContains(keyword);
    }
}