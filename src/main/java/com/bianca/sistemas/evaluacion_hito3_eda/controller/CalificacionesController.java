package com.bianca.sistemas.evaluacion_hito3_eda.controller;

import com.bianca.sistemas.evaluacion_hito3_eda.service.CalificacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notas")
public class CalificacionesController {

    @Autowired
    private CalificacionesService service;

    @GetMapping("/agregar") // [cite: 33, 35]
    public String agregar(@RequestParam double valor) {
        return service.agregarNota(valor);
    }

    @GetMapping // [cite: 35]
    public double[] listar() {
        return service.obtenerTodas();
    }

    @GetMapping("/promedio") // [cite: 35]
    public double promedio() {
        return service.calcularPromedio();
    }

    @GetMapping("/max") // [cite: 35]
    public double maximo() {
        return service.obtenerMax();
    }

    @GetMapping("/min") // [cite: 35]
    public double minimo() {
        return service.obtenerMin();
    }
}