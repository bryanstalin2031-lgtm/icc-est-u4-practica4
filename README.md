Practica N4

Asginatura Estructura de datos

Nombre : Bryam Carchi

Fecha de entrega : 2/6/2026
![alt text](<assets/Captura de pantalla 2026-06-02 a la(s) 5.50.21 p. m..png>)

## Tabla 1. Escenario 1: arreglo completamente desordenado

| Tamaño de muestra | Tiempo Inserción | Tiempo QuickSort | Algoritmo más rápido | Observación |
|---|---|---|---|---|
| 10.000 | 2.05024834E8 |2902208.0 | QuickSort | El algoritmo fue mas eficiente en arreglos grandes |
| 50.000 | 4.551596542E9 |1.2354917E7 | QuickSort | El insercion es mas lento porque no puede manejar arreglo grandes |
| 100.000 | 1.7471260584E10 | 2.6578542E7 | QuickSort | Aunque es mas grande sigue siendo eficiente QuickSort |

## Tabla 2. Escenario 2: arreglo ordenado más una nueva persona

| Tamaño de muestra | Tiempo Inserción | Tiempo QuickSort | Algoritmo más rápido | Observación |
|---|---|---|---|---|
| 10.001 | 161291.0  | 887458.0| Inserción | El algoritmo de Insercion fue mas rapido porque es mas eficiente en arreglos que se encuentran mas ordenados |
| 50.001 | 1967167.0 | 5822542.0 | Inserción | Sigue siendo mas eficiente Inserción  |
| 100.001 | 913542.0 | 1.6570084E7| Inserción | Aunque el arreglo aumento de tamaño Inserción sigue trabajando de mejor manera|

## Análisis requerido

Después de completar las tablas, se debe responder:

•⁠  ⁠¿Qué algoritmo fue más rápido en el escenario desordenado?
El mejor fue el algoritmo de QuickSort ya que pudo manejar de mejor manera el arreglo ya sea de 10000 , 50000 y 100000

•⁠  ⁠¿Qué algoritmo fue más rápido en el escenario casi ordenado?
La que mejor manejo fue Inserción ya que este algoritmo trabaja de mejor manera los arreglos que estan casi ordenados debido a que hara menos comparaciones.

•⁠  ⁠¿El crecimiento del tamaño de muestra afectó por igual a los dos algoritmos?
Si entre siga creciendo el arreglo el tiempo de ordenamiento de cada uno aumentara en proporcion al tamaño del arreglo.

•⁠  ⁠¿Por qué Inserción puede mejorar cuando el arreglo ya está casi ordenado?
Al estar casi ordenado ya no hace cambios  ni va ha hacer comparaciones innecesarias.

•⁠  ⁠¿Por qué QuickSort suele ser mejor cuando los datos están muy desordenados?
El algoritmo QuickSort no hace comparaciones con los elemento de alado sino lo hace en base al pivote haciendo que sea mas eficiente.

## Conclusiones

Se debe redactar al menos tres conclusiones propias. Las conclusiones deben estar relacionadas directamente con los tiempos obtenidos.

•⁠  ⁠Conclusión 1: Se pudo comprobar y se hizo la comparacion de los dos algoritmos tanto el Insercion como el QuickSort en diferentes tamaños de arreglos.
•⁠  ⁠Conclusión 2: Evidenciamos que el metodo QuickSort trabaja de manera mas rapida en arreglos desordenados y de mayor tamaño ya que hace menos comparaciones.
•⁠  ⁠Conclusión 3: En cambio el metodo de Insercion trabaja mejor en arreglo casi ordenados y mas rapido ya que no movera los datos y ya no hara comparaciones innecesarias