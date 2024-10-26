fun fibonacci (n: Int): Int{
    return if (n <= 1){
        n
    }else{
        fibonacci(n-1) + fibonacci(n-2)
    }
}

fun sumaRecursiva(n: Int): Int{
    return if (n <= 1){
        1
    } else{
        n + sumaRecursiva(n-1)
    }
}

fun sumaLista (lista: List<Int>): Int{
    return if (lista.isEmpty()){
        0
    }else {
        lista[0] + sumaLista(lista.drop(1))
    }
}

fun fun main(args: Array<String>) {
    val numero = 15
    println("\nEjemplo1")
    println ("Finocci de $numero es: $(fibonacci(numero))")

    println("\nEjemplo2")
    println("La suma de 1  a $numero es: $(sumaRecursiva(numero))")

    println("\nEjemplo3")
    println("La suma de la lista es: $(sumaLista(numero))")
} 

