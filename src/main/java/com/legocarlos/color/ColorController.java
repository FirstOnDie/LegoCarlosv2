package com.legocarlos.color;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/color")
public class ColorController {

    private final ColorService colorService;

    @GetMapping
    public List<Color> getAll() {
        return colorService.getAll();
    }

    @GetMapping("/{id}")
    public Color getcolorById(@PathVariable Long id) {
        return colorService.getById(id);
    }

    @PostMapping
    public Color createcolor(@RequestBody Color color) {
        return colorService.save(color);
    }

    @PutMapping("/{id}")
    public Color updatecolor(@PathVariable Long id, @RequestBody Color color) {
        color.setId(id);
        return colorService.save(color);
    }

    @DeleteMapping("/{id}")
    public void deletecolor(@PathVariable Long id) {
        colorService.delete(id);
    }

    @GetMapping("/search")
    public List<Color> searchcolor(@RequestParam String keyword) {
        return colorService.search(keyword);
    }
}