interface FizzBuzzInterface {
    fun evaluateNumber(number: Int): String
}

class FizzBuzz : FizzBuzzInterface {

    override fun evaluateNumber(number: Int): String {
        return when {
            number % 3 == 0 && number % 5 == 0 -> "FizzBuzz"
            number % 3 == 0 -> "Fizz"
            number % 5 == 0 -> "Buzz"
            else -> number.toString()
        }
    }

    fun printFizzBuzz(range: IntRange) {
        for (number in range) {
            println(evaluateNumber(number))
        }
    }
}

fun main() {
    print("Puedes ingresar el rango máximo (debe ser mayor que 0): ")
    val input = readLine()?.toIntOrNull()

    if (input != null && input > 0) {
        val fizzBuzz = FizzBuzz()
        fizzBuzz.printFizzBuzz(1..input)
    } else {
        println("Invalido. Ingrese un número entero mayor que 0.")
    }
}
