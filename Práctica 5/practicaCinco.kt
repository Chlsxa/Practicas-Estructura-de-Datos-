class Node<T>(val value: T, var next: Node<T>? = null)
class Queue<T> {
    private var front: Node<T>? = null
    private var rear: Node<T>? = null
    private var size = 0

    fun enqueue(value: T) {

        val newNode = Node(value)
        if (rear != null) {
        rear?.next = newNode
        }
        rear = newNode
        if (front == null) {
        front = rear
        }
        size++
    }
        
    fun dequeue(): T? {
        if (isEmpty()) {
        println("Queue is empty.")
        return null
        }
        val dequeuedValue = front?.value
        front = front?.next
        if (front == null) {
        rear = null
        }
        size--
        return dequeuedValue
    }

    fun peek(): T? {
        return front?.value
    }

    fun isEmpty(): Boolean {
        return front == null
    }
    
    fun size(): Int {
        return size
    }
    
    override fun toString(): String {
        if (isEmpty()) return "[]"
        val result = StringBuilder("[")
        var current = front
        while (current != null) {
        result.append(current.value)
        if (current.next != null) {
        result.append(", ")
        }
        current = current.next
        }
        result.append("]")
        return result.toString()
    }
}

/*Ejercicio 1: simulación de sistema de turnos en un banco */

fun fun main(args: Array<String>) {

    println(".:: Ejercicio 1 ::.")

    val bancoQueue = Queue<int>()

    for (i in 1..10) {
        bancoQueue.enqueue(1)
        
    }

    println("Turnos de clientes inicial: $bancoQueue")

    for(i in 1..8){
        println("Atendiendoal cliente: ${bancoQueue.dequeue}")
    }
    println("Clientes restantes : ${bancoQueue.size()}")

    /*Ejercicio 2 Gestion de tareas */
    println(".:: Ejercicio 2 ::.")

    val tareasQueue = Queue<String>()

    tareasQueue.enqueue("Limpiar")
    tareasQueue.enqueue("Cocinar")
    tareasQueue.enqueue("Estudiar")
    tareasQueue.enqueue("Jugar")
    tareasQueue.enqueue("Leer")

    println("Tareas pendientes: $tareasQueue")

    while (!tareasQueue.isEmpty()){
        println("Seesta realizandp la tarea de: ${tareasQueue.dequeue()}")
    }
}


