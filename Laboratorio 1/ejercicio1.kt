fun countNumbers(n: Int) {
    if (n <= 0) {
        println("Ingresa un número mayor que cero.")
        return
    }

    var primeCount = 0
    var evenCount = 0
    var oddCount = 0

    for (i in 1..n) {
        if (isPrime(i)) primeCount++
        if (i % 2 == 0) evenCount++ else oddCount++
    }

    println("De 1 a $n:")
    println("Números primos: $primeCount")
    println("Números pares: $evenCount")
    println("Números impares: $oddCount")
}

fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}

fun main() {
    print("Ingrese un número entero N: ")
    val input = readLine()?.toIntOrNull()

    if (input != null) {
        countNumbers(input)
    } else {
        println("Invalido, ingrese un número entero.")
    }
}
