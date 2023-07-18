package com.legocarlos.pieza;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/pieza")
public class PiezaController {

    private final PiezaService piezaService;

    @GetMapping
    public List<Pieza> getAllpieza() {
        return piezaService.getAllpieza();
    }

    @GetMapping("/{id}")
    public Pieza getpiezaById(@PathVariable Long id) {
        return piezaService.getpiezaById(id);
    }

    @PostMapping
    public Pieza createpieza(@RequestBody Pieza pieza) {
        return piezaService.savepieza(pieza);
    }

    @PutMapping("/{id}")
    public Pieza updatepieza(@PathVariable Long id, @RequestBody Pieza pieza) {
        pieza.setId(id);
        return piezaService.savepieza(pieza);
    }

    @DeleteMapping("/{id}")
    public void deletepieza(@PathVariable Long id) {
        piezaService.deletepieza(id);
    }

    @GetMapping("/search")
    public List<Pieza> searchpieza(@RequestParam String keyword) {
        return piezaService.searchpieza(keyword);
    }
}