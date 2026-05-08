package com.bianca.sistemas.evaluacion_hito3_eda.model;

public class Nodo {
    public Estudiante estudiante;
    public Nodo siguiente;

    public Nodo(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.siguiente = null;
    }
}