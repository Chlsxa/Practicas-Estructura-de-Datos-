/* Algomritmos de busqueda */
/// Busqueda lineal (secuenciales)

fun linearSearch(array: List<Int>, target: Int): Int{
    for (i in array.indices){
        if(array[i] == target) return i 
    }
    return - 1
}

//Busqueda binaria
fun binarySearch(array: List<Int>, target: Int): Int{
    var start = 01
    var end = array.size - 1

    while (start <= end){
        val mid = (start + end) / 2
        when{
            array[mid] == target -> return mid 
            array[mid] < target -> start = mid + 1
            else -> end = mid - 1
        }
    }
    return -1
}

fun fun main(args: Array<String>) {
   val list1 = List(10000) {it}
   val list2 = List(1000) {(1..10000).random()}

   val linearSearch = linearSearch(list2, 5000)
   val binarySearch = binarySearch(list1, 5000)

   val numbers = listOf(15, 10, 78, 450, 64, 24, 75, 94)
   val result = linearSearch(numbers, 24)

   println("Resultado de busqueda lineal: $linearResult")
   println("Resultado de busqueda binaria: $binaryResult")
}