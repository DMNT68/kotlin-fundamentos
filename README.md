# Kotlin Fundamentos

- ### Tipos de datos
- ### Concatenación
- ### Arrays
- ### Loops o blucles
  - for(i in 1..4)
- ### Funciones
  - Modificadores de acceso
    - **public**:  modificador de acceso por defecto, pueden ser accedidas desde cualquier parte del código sin ningun tipo de excepción,
    - **private**: limita la visibilidad solo al archivo o clase en donde la función se haya definido 
    - **protective**: similar a private, no se puede acceder fuera de la clase, pero, si estamos fuera heredando de una clase donde hemos definido la función si podemos acceder, solo se aplica a las clases y a sus miembros 
    - **intenal**: restringe al acceso a cualquier codigo dentro del mismo modulo( cojunto de archivos kotlin compilados juntos )
  - Palabras de reservadas
    - **open**: indica que una función puede ser sobreescrita por una subclase.
    - **final**:  contrario de open, prohibe sobrescribir una función. Si en una función no se define nada explicitamente está como final.
    - **abstract**: utilizado para definir funciones que no tienes implementación.
    - **override**:  indica que una funcion esta proporcionando una implementacion abstracta o remplazando una funcion open de un superclase, la esta sobrescribiendo.
    - **operator**:  permite a una función sobrecargar un operador.
    - **infix**:  permite que la función sea llamada sin punto y sin parentesis.
    - **inline**:  copia el codigo de la funcion para reducir la sobrecarga en la creacion de objetos.
    - **tailrec**:  indica que una función es rescursiva de cola, permite que el compilador la optimice para evitar desbordamientos de pila.
    - **suspend**: permite marcar una función suspendibles, pueden ser pausadas para luego ser renaudad. utilizada en programación asincrona.
- ### Programacion orientada a objetos
  Paradígma de programación que no permite llegar un objeto del mundo real a codigo, programación

  - **Clases**: Una clase es el esquema o esqueleto que no permite crear objetos, estos están conformados principalmente por `propiedades` y `métodos o funciones`.
  - **Objetos**:  Son la creación o instancia de una clase.
  - **Constructores**: nos permite inicializar una clase (un estado inicial al objeto a las propiedades de la clase), exiten mas de un constructor que son los siguientes
    - _**Constructor primario**_: se establecen cuando creas la clase `class NombreClase (var propiedad1, var propiedad2)`
    - **_constructor secundario_**: Constructor definido dentro del cuerpo de la clase, nos permite mayor flexibilidad al inicialiar la clase (establecer estado inicial a propiedades que no se establecieron en el constructor principal)
    - **_init_**: no permite darle logica a las campos del contructores como por ejemplo validar cuando se ingresa un valor 