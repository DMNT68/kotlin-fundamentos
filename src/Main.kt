fun main() {
    //tiposDatos()
    arrays()
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
