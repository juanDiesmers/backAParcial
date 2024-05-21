package co.parcial.web.controller;

import co.parcial.web.dtos.CelularDTO;
import co.parcial.web.services.CelularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/celulares")
public class CelularController {
    @Autowired
    private CelularService celularService;

    @GetMapping
    public List<CelularDTO> getAllCelulares() {
        return celularService.getAllCelulares();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CelularDTO> getCelularById(@PathVariable Long id) {
        return ResponseEntity.ok(celularService.getCelularById(id));
    }

    @PostMapping
    public ResponseEntity<CelularDTO> createCelular(@RequestBody CelularDTO celularDTO) {
        return ResponseEntity.ok(celularService.createCelular(celularDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CelularDTO> updateCelular(@PathVariable Long id, @RequestBody CelularDTO celularDTO) {
        return ResponseEntity.ok(celularService.updateCelular(id, celularDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCelular(@PathVariable Long id) {
        celularService.deleteCelular(id);
        return ResponseEntity.noContent().build();
    }
}
