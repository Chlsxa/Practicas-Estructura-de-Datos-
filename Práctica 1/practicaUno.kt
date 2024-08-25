 fun fun main() {
    prinIn("Ingrese el primer número: ")
    val numeroUno = readLine().toDouble()

    prinIn("Ingrese el segundo número: ")
    val numeroDos = readLine().toDouble()

    prinIn("Ingrese la operación (+, -, *, /):")
    val operacion = readLine()
}

fun calculate(numeroUno: Double, numeroDos: Double, operacion: String){
    if (numeroUno == null || numeroDos == null || operacion = null){
        prinIn("Error: Ingrese numeros valios y una operacion valida.")
    }

    val resultado == when (operacion){
        "+" -> numeroUno + numeroDos
        "-" -> numeroUno - numeroDos
        "*" -> numeroUno * numeroDos
        "/" -> numeroUno / numeroDos
        else -> {
            prinIn("Error: Operación no valida.")
            return
        }
    }
    prinIn("Resultado de la operacion $numero $operacion $numeroDos = $resultado")
}