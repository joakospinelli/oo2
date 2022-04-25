## 2.1)
Para mejorar el protocolo podrían cambiarse los nombres de los métodos para hacerlos más descriptivos.

## 2.2)
En el primer diseño la clase Persona se encarga de devolver el mensaje sobre si es participante del proyecto o no. Para resolver esto, debe recibir un proyecto como parámetro y consultar si se encuentra dentro de los participantes del proyecto recibido.
Esto es ineficiente, porque necesita obtener la colección de participantes del proyecto, siendo que el proyecto ya conoce a las personas.

Por lo tanto, la solución es correcta, puesto que cambia el método hacia el proyecto y recibe una persona como parámetro, por lo que sólo tiene que buscar a dicha persona dentro de la colección de participantes.

## 2.3)
En vez de tener un sólo metodo que se encargue de realizar todas las cuentas e imprimir todos los resultados, los cálculos podrían calcularse en métodos separados y luego reunir los resultados en un método dedicado solamente a imprimir.