# Laboratorio2
Trabajo grupal Galahad Constante y Melane Herreria 
# Laboratorio 02: Eficiencia y Complejidad Algorítmica

*Universidad Central del Ecuador*  
*Carrera:* Ingeniería en Sistemas de Información – Cuarto Semestre  
*Asignatura:* Algoritmos (Semana 2)  

---

## 1. Descripción del Problema
El objetivo de este laboratorio es implementar, medir, comparar y justificar dos estrategias algorítmicas diferentes que resuelven un mismo problema: *detectar y separar elementos únicos y repetidos* dentro de un conjunto de datos[span_1](start_span)[span_1](end_span). 

Para cumplir con el análisis de complejidad, se contrastan dos enfoques:
* *Estrategia A (Búsqueda Secuencial Manual):* Utiliza bucles anidados y arreglos auxiliares creados desde cero para comparar cada elemento de la entrada con los elementos únicos ya almacenados.
* *Estrategia B (Estructura Auxiliar / Tabla Hash):* Utiliza estructuras de datos optimizadas (HashSet / HashMap) para realizar búsquedas e inserciones en tiempo constante promedio.

## 2. Hipótesis
La *Estrategia B* escalará de manera lineal ($O(n)$)[span_2](start_span)[span_2](end_span), procesando grandes volúmenes de datos en milisegundos, mientras que la *Estrategia A* presentará un crecimiento cuadrático ($O(n^2)$) debido a sus bucles anidados, volviéndose computacionalmente inviable a medida que el tamaño de entrada ($n$) aumente de forma exponencial[span_3](start_span)[span_3](end_span).

## 3. Estructura del Repositorio
```text
laboratorio-02-eficiencia-complejidad/
├── README.md                          # Documentación principal del proyecto
├── analysis.md                        # Interpretación técnica y justificación de escalabilidad
├── src/
│   └── EliminarRepetidos.java         # Código fuente instrumentado con conteo de operaciones y tiempo
└── results/
    └── resultados_benchmark.md        # Tablas de benchmarking y registros experimentales
