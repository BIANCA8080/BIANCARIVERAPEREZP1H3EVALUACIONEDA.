package com.bianca.sistemas.evaluacion_hito3_eda.service;

import org.springframework.stereotype.Service;

@Service
public class CalificacionesService {
    // El PDF exige un arreglo de exactamente 10 
    private double[] notas = new double[10];
    private int contador = 0;

    public String agregarNota(double valor) {
        if (contador < 10) {
            notas[contador] = valor;
            contador++;
            return "Nota " + valor + " agregada en la posición " + (contador - 1);
        }
        return "Error: El arreglo está lleno (máximo 10 notas).";
    }

    public double[] obtenerTodas() {
        return notas;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < contador; i++) {
            suma += notas[i];
        }
        return contador == 0 ? 0 : suma / contador;
    }

    public double obtenerMax() {
        double max = notas[0];
        for (int i = 1; i < contador; i++) {
            if (notas[i] > max) max = notas[i];
        }
        return max;
    }

    public double obtenerMin() {
        double min = notas[0];
        for (int i = 1; i < contador; i++) {
            if (notas[i] < min) min = notas[i];
        }
        return min;
    }
}