package com.bianca.sistemas.evaluacion_hito3_eda.service;

import org.springframework.stereotype.Service;

@Service
public class AulaService {
    // Matriz de 5x5: 0 libre, 1 ocupado [cite: 38, 41, 42]
    private int[][] asientos = new int[5][5];

    public String ocuparAsiento(int fila, int columna) {
        if (fila >= 0 && fila < 5 && columna >= 0 && columna < 5) {
            asientos[fila][columna] = 1;
            return "Asiento [" + fila + "][" + columna + "] ocupado.";
        }
        return "Error: Posición fuera de rango.";
    }

    public String liberarAsiento(int fila, int columna) {
        if (fila >= 0 && fila < 5 && columna >= 0 && columna < 5) {
            asientos[fila][columna] = 0;
            return "Asiento [" + fila + "][" + columna + "] liberado.";
        }
        return "Error: Posición fuera de rango.";
    }

    public int[][] obtenerMatriz() {
        return asientos;
    }

    public int contarOcupados() {
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (asientos[i][j] == 1) contador++;
            }
        }
        return contador;
    }
}