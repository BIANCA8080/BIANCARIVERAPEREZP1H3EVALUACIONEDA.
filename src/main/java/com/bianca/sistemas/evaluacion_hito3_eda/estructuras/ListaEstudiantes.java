package com.bianca.sistemas.evaluacion_hito3_eda.estructuras;

import com.bianca.sistemas.evaluacion_hito3_eda.model.Estudiante;
import com.bianca.sistemas.evaluacion_hito3_eda.model.Nodo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ListaEstudiantes {
    private Nodo cabeza = null;

    public void insertar(Estudiante estudiante) { // [cite: 65]
        Nodo nuevo = new Nodo(estudiante);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) temp = temp.siguiente;
            temp.siguiente = nuevo;
        }
    }

    public List<Estudiante> listar() { // [cite: 66]
        List<Estudiante> lista = new ArrayList<>();
        Nodo temp = cabeza;
        while (temp != null) {
            lista.add(temp.estudiante);
            temp = temp.siguiente;
        }
        return lista;
    }

    public void ordenarPorPuntaje() { // [cite: 67]
        if (cabeza == null || cabeza.siguiente == null) return;
        boolean huboCambio;
        do {
            huboCambio = false;
            Nodo actual = cabeza;
            Nodo siguiente = cabeza.siguiente;
            while (siguiente != null) {
                if (actual.estudiante.getPuntaje() < siguiente.estudiante.getPuntaje()) {
                    Estudiante temp = actual.estudiante;
                    actual.estudiante = siguiente.estudiante;
                    siguiente.estudiante = temp;
                    huboCambio = true;
                }
                actual = siguiente;
                siguiente = siguiente.siguiente;
            }
        } while (huboCambio);
    }

    public Estudiante buscar(String nombre) { // [cite: 68]
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.estudiante.getNombre().equalsIgnoreCase(nombre)) return temp.estudiante;
            temp = temp.siguiente;
        }
        return null;
    }
}