fun main() {
    //tiposDatos()
    //arrays()
   calcularFactorial(4)

}

fun tiposDatos(){
    var nombre:String = "Andrés"            // variable string poniendo explicitamente el tipo de dato
    val apellido = "Salgado"                // constante string si poner tipo de dato, kotlin infiere el tipo
    var edad:Short = 30                     // variable entero (short)
    var esMayorEdad = true                  // variable boolean

    print("El nombre de la persona es: " + nombre)              // imprimir en consola sin salto de línea
    println(" su apellido es: $apellido")                       // imprimir en consola con salto de línea
    println("Es mayor de edad: " + esMayorEdad)                 // Concatenación con +
    println("Tiene la edad de: $edad")                          // Concatenacion con template
}

fun arrays () {
    var arregloNumeros:Array<Int> = arrayOf(1,2,3,4,5)          // Array de enteros, arrayOf método que permite inicializar el array con valores establecildos
    var nombreMeses = arrayOf("Enero","Febrero")                // Array de Strings (cadena de texto) infiriendo el tipo
    val mi_matriz = Array(5) {0}                           // Usando la Clase Array que permite establece el tamaño o posiciones del array (5), y {0} inicializa el array en 0 en todas la posiciones


    println(nombreMeses[1])         // imprime el elemento 2 de la posición 1

}

// loop o bucles
fun calcularFactorial(numero: Int): Long {
    var resultado = 1L
    for (i in 2..numero) {
        resultado *= i
        println("$i ---> $resultado")
    }
    println("El factorial de $numero es $resultado")
    return resultado
}

// Funciones, son bloques de código que permite resolver un problema
/*
Modificadores de acceso: nos permite definir el nivel de acceso es decir, como se va a poder acceder a la función desde
fuera de la clase donde se a definido.
    public -->  modificador de acceso por defecto, pueden ser accedidas desde cualquier parte del código sin ningun tipo
                de excepcion
    private --> limita la visibilidad solo al archivo o clase en donde la función se haya definido
    protective --> similar a private, no se puede acceder fuera de la clase, pero, si estamos fuera heredando de una
                    clase donde hemos definido la función si podemos acceder, solo se aplica a las clases y a sus miembros
    intenal --> restringe al acceso a cualquier codigo dentro del mismo modulo( cojunto de archivos kotlin compilados juntos )

Palabras reservadas
    open --> indica que una función puede ser sobreescrita por una subclase.
    final --> contrario de open, prohibe sobrescribir una función. Si en una función no se define nada explicitamente está como final.
    abstract --> utilizado para definir funciones que no tienes implementación.
    override --> indica que una funcion esta proporcionando una implementacion abstracta o remplazando una funcion open de un superclase, la esta sobrescribiendo.
    operator --> permite a una función sobrecargar un operador.
    infix --> permite que la función sea llamada sin punto y sin parentesis.
    inline --> copia el codigo de la funcion para reducir la sobrecarga en la creacion de objetos.
    tailre --> indica que una función es rescursiva de cola, permite que el compilador la optimice para evitar desbordamientos de pila.
    suspend --> permite marcar una función suspendibles, pueden ser pausadas para luego ser renaudad. utilizada en programación asincrona.

 */
