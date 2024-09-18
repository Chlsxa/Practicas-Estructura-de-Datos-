//Ejemplo 1

class Caja<T>(val contenido: T){
    fun obtenerConenido(): T{
        return contenido
    }
}

//Ejemplo2
fun<T> imprimirDato(elemento: T){
    println(elemento)
}

//Ejemplo 3
fun <T : Number> sumar(a: T, b: T): Double{
    return a.toDouble() + b.toDouble()
}


//Ejemplo 4
fun <T> imprimirSiEsNumero(valor: T) where T: Number{
    println(valor.toDouble)
}

fun fun main(args: Array<String>) {

    val cajaInt = Caja(42.4156451)
    val cajaString = Caja ("Soy una cadena")
    val nombre = "Chelsea"
    val entero = 1456657

    println("***** Ejemplo 1 *****")
    println(cajaInt.obtenerConenido())
    println(cajaInt.obtenerConenido())
    println("*****Fin del Ejmplo 1 *****")

    println("\n***** Ejemplo 2 *****")
    imprimirDato(nombre)
    imprimirDato(entero)
    println("***** Fin del Ejmplo 2 *****")

    println("\n***** Ejemplo 3 *****")
    println("La suma es: ${suma}")
    println("***** Fin del Ejemplo 3 *****")

    println("\n***** Ejemplo 4 *****")
    imprimirSiEsNumero(entero)
    println("***** Fin del Ejemplo 4 *****")
}