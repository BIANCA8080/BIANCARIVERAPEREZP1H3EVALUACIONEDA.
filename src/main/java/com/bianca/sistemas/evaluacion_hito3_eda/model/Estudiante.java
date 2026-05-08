package com.bianca.sistemas.evaluacion_hito3_eda.model;

public class Estudiante {
    private String nombre; // [cite: 58]
    private int puntaje;   // [cite: 59]

    public Estudiante(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    // Getters necesarios para el servicio
    public String getNombre() { return nombre; }
    public int getPuntaje() { return puntaje; }
}