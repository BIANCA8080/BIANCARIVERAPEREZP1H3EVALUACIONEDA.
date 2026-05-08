# Evaluación Hito 3 - Estructuras de Datos
**Estudiante:** BIANCA MOIRA RIVERA PEREZ
**Carrera:** Ingeniería de Sistemas 

## Descripción
API REST desarrollada con Spring Boot para la gestión de calificaciones, asientos de aula y lista de estudiantes.

## Instrucciones de Ejecución
1. Clonar el repositorio.
2. Abrir en un IDE (VS Code o IntelliJ).
3. Ejecutar la aplicación mediante el archivo `EvaluacionHito3EdaApplication.java` o usando el comando `./mvnw spring-boot:run`.
4. La aplicación iniciará en el puerto `8080`.

## Guía de Endpoints (Peticiones)

### Parte 1: Calificaciones (Arreglo Unidimensional)
* **Agregar nota:** `http://localhost:8080/notas/agregar?valor=90`
* **Ver todas:** `http://localhost:8080/notas`
* **Promedio:** `http://localhost:8080/notas/promedio`
* **Máxima/Mínima:** `/notas/max` y `/notas/min`

### Parte 2: Aula (Matriz 5x5)
* **Ver matriz:** `http://localhost:8080/aula`
* **Ocupar asiento:** `http://localhost:8080/aula/ocupar?fila=1&columna=2`
* **Liberar asiento:** `http://localhost:8080/aula/liberar?fila=1&columna=2`
* **Contar ocupados:** `http://localhost:8080/aula/ocupados`

### Parte 3: Lista Enlazada (Estudiantes)
* **Agregar:** `http://localhost:8080/estudiantes/agregar?nombre=Ana&puntaje=95`
* **Listar:** `http://localhost:8080/estudiantes`
* **Ordenados (Mayor a Menor):** `http://localhost:8080/estudiantes/ordenados`
* **Buscar:** `http://localhost:8080/estudiantes/buscar/Ana`