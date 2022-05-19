# Herencia

### a)

Tengo que implementar una nueva clase abstracta para la fuente de energía nueva, y luego tengo que crear una clase para las demás variantes del robot (locomoción o armas).
Suponiendo que no agregué clases en las demás variantes del robot, tengo que crear 7 clases:
- 1 para la nueva fuente de energía
- 2 para cada tipo de locomoción
- 4 para cada tipo de arma (2 para cada tipo de locomoción)

### b)

Como la implementación de la herencia es estática, no se puede cambiar el tipo de armas de un robot (ni ninguna variante) durante el tiempo de ejecución del programa.

### c)

Yo lo almacenaría en la clase abstracta Robot, puesto que la batería va a ser una variable en común a todos los tipos de robot independientemente de su instancia, aunque luego la gasten de maneras diferentes. <br>
Por eso el método de consumir batería es abstracto en la superclase Robot y cada subclase lo implementa de manera diferente.

#

# Composición

### a)

Tengo que implementar una única subclase que extienda de LocomotionSystem y que represente al nuevo sistema que queremos desarrollar.

### b)

La composición de un objeto es dinámica, por lo que puedo cambiar los objetos que lo componen durante la ejecución del programa. De esta manera sí es posible cambiar el sistema de armas sin tener que cambiar todo el robot.

### c)

Yo lo implementaría en la clase del Robot, puesto que la carga de la batería es algo que el robot tiene independientemente de cuáles sean sus partes.

#

# Ventajas y desventajas

### Herencia:
- Permite extender el Framework mediante la creación de subclases. Es más flexible puesto que se puede acceder a las variables internas y a los métodos de las clases superiores, y permite crear subclases con las combinaciones (funciona mejor con pocas combinaciones).
- Su desventaja es que no puede modificarse dinámicamente, y si hay muchas combinaciones tenemos que crear muchas subclases, que a la larga puede terminar en repetición de código.

### Composición:
- Permite modificar las clases dinámicamente durante la ejecución del programa y mejora la delegación de responsabilidades entre objetos.
<br>
También funciona mejor en casos de que haya muchas combinaciones, puesto que el funcionamiento de sus variantes se encuentra separado en objetos.
- Su desventaja es que es menos flexible, puesto que al ser objetos independientes no pueden usarse las variables instancias o métodos de otros, y tenemos que enviarles toda la información posible para realizar sus tareas.
<br>
Además, el framework es menos modificable y dependemos más de sus opciones previstas.


