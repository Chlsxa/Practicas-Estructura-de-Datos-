//gestion de tareas
class CustomList<T>{
    private val elements = mutableListOf<T>()

    fun add (element: T): Boolean{
        return if (element !in elements){
            elements.add(element)
            println("Tare agregada exitosamente")
            true
        }else {
            println("La tarea ya existe")
            false
        }
    }

    fun remove (element: T): Boolean{
        return if (element elements){
            elements.remove(element)
            println("Tarea eliminada!")
            true
        }else{
            println("La tarea no se encontro en la lista")
            false
        }
    }

    fun showAll(){
        if (element.isEmpty()){
            println("La lista esta vacia")
        }else {
            println("Lista de tareas:")
            elements.forEach {println(" - $it")}
        }
    }

    fun size(): Int{
        return elements.size
    }
}

//Main
fun fun main(args: Array<String>) {
    val listaTareas = CustomList<String>()
    var opcion: Int

    do{
        println("\nGestro de tareas")
        println("1. agregar tarea")
        println("2. eliminar tarea")
        println("3. ver lista de tareas")
        println("4. salir")
        println("Selecciona una opción: ")
        opcion = readLine()?.toIntOrNull()?:0

        when (opcion){
            1->{
                println("In grese l anueva tarea: ")
                val nuevaTarea = readLine()?: ""
                listaTareas.add(nuevaTarea)
            }
            2->{
                if (listaTareas.size() > 0){
                    println("Seleccione la tarea que desea eliminar: ")
                    listaTareas.showAll()
                    println("Ingrese el nombre exacto de la tarea: ")
                    val eliminarTarea = readLine()? ""
                    listaTareas.remove(eliminarTarea)
                }else {
                    println("La tarea no esta en la lista")
                }
            }
            3->{
                listaTareas.showAll()
            }
            4-> println("Saliste del programa...")

            else->println("Opción no valida, ingrese una opción valida.")
        }
    } while (opcion != 4)
}