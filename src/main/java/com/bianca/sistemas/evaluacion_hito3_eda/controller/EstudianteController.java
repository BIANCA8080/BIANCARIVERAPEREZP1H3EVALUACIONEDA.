package com.bianca.sistemas.evaluacion_hito3_eda.controller;

import com.bianca.sistemas.evaluacion_hito3_eda.estructuras.ListaEstudiantes;
import com.bianca.sistemas.evaluacion_hito3_eda.model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private ListaEstudiantes lista;

    @GetMapping("/agregar") // [cite: 72, 74]
    public String agregar(@RequestParam String nombre, @RequestParam int puntaje) {
        lista.insertar(new Estudiante(nombre, puntaje));
        return "Estudiante " + nombre + " registrado.";
    }

    @GetMapping // [cite: 74]
    public List<Estudiante> obtenerTodos() {
        return lista.listar();
    }

    @GetMapping("/ordenados") // [cite: 74]
    public List<Estudiante> obtenerOrdenados() {
        lista.ordenarPorPuntaje();
        return lista.listar();
    }

    @GetMapping("/buscar/{nombre}") // [cite: 74]
    public Estudiante buscar(@PathVariable String nombre) {
        return lista.buscar(nombre);
    }
}