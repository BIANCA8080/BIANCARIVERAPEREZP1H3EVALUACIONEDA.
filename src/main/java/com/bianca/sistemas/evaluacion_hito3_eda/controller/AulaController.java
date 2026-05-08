package com.bianca.sistemas.evaluacion_hito3_eda.controller;

import com.bianca.sistemas.evaluacion_hito3_eda.service.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aula")
public class AulaController {

    @Autowired
    private AulaService service;

    @GetMapping // [cite: 54]
    public int[][] mostrarAula() {
        return service.obtenerMatriz();
    }

    @GetMapping("/ocupados") // [cite: 54]
    public int totalOcupados() {
        return service.contarOcupados();
    }

    @GetMapping("/ocupar") // [cite: 51, 54]
    public String ocupar(@RequestParam int fila, @RequestParam int columna) {
        return service.ocuparAsiento(fila, columna);
    }

    @GetMapping("/liberar") // [cite: 52, 54]
    public String liberar(@RequestParam int fila, @RequestParam int columna) {
        return service.liberarAsiento(fila, columna);
    }
}