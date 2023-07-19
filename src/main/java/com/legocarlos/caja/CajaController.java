package com.legocarlos.caja;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/caja")
public class CajaController {

    private final CajaService cajaService;

    @GetMapping
    public List<Caja> getAll() {
        return cajaService.getAll();
    }

    @GetMapping("/{id}")
    public Caja getcajaById(@PathVariable Long id) {
        return cajaService.getById(id);
    }

    @PostMapping
    public Caja createcaja(@RequestBody Caja caja) {
        return cajaService.save(caja);
    }

    @PutMapping("/{id}")
    public Caja updatecaja(@PathVariable Long id, @RequestBody Caja caja) {
        caja.setId(id);
        return cajaService.save(caja);
    }

    @DeleteMapping("/{id}")
    public void deletecaja(@PathVariable Long id) {
        cajaService.delete(id);
    }

    @GetMapping("/search")
    public List<Caja> searchcaja(@RequestParam String keyword) {
        return cajaService.search(keyword);
    }
}