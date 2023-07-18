package com.legocarlos.pieza;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/pieza")
public class piezaController {

    private final piezaService piezaService;

    @GetMapping
    public List<pieza> getAllpieza() {
        return piezaService.getAllpieza();
    }

    @GetMapping("/{id}")
    public pieza getpiezaById(@PathVariable Long id) {
        return piezaService.getpiezaById(id);
    }

    @PostMapping
    public pieza createpieza(@RequestBody pieza pieza) {
        return piezaService.savepieza(pieza);
    }

    @PutMapping("/{id}")
    public pieza updatepieza(@PathVariable Long id, @RequestBody pieza pieza) {
        pieza.setId(id);
        return piezaService.savepieza(pieza);
    }

    @DeleteMapping("/{id}")
    public void deletepieza(@PathVariable Long id) {
        piezaService.deletepieza(id);
    }

    /*@GetMapping("/search")
    public List<pieza> searchpieza(@RequestParam String keyword) {
        return piezaService.searchpieza(keyword);
    }*/
}