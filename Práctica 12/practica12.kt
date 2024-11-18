data class Tarea(val nombre: String, val prioridad: Int)

class NodoArbol(val tarea: Tarea){
    var izquierda: NodoArbol? = null
    var derecha: NodoArbol? = null
}

class ArbolTareas{
    private var raiz: NodoArbol? = null

    fun insertar(tarea: Tarea){
        raiz = insertarRecursivo(raiz, tarea)
    }

    private fun insertarRecursivo(actual: NodoArbol?, tarea: Tarea): NodoArbol{
        if (actual==null){
            return NodoArbol(tarea)
        }

        if(tarea.prioridad < actual.tarea.prioridad){
            actual.izquierda = insertarRecursivo(actual.izquierda, tarea)
        }else{
            actual.derecha = insertarRecursivo( actual.derecha, tarea)
        }
        return actual
    }

    fun mostrarEnOrden(){
        mostrarEnOrdenRecursivo(raiz)
    }

    private fun mostrarEnOrdenRecursivo(nodo: NodoArbol?){
        if(no != null){
            mostrarEnOrdenRecursivo(nodo.izquierda)
            println("Tarea: ${nodo.tarea.nombre}, Prioridad: ${nodo.tarea.prioridad}")
        }
    }
}

//gestión de tareas
class CustomList<T>{
    private val elements = mutableListOf<T>()

    fun add (element: T): Boolean{
        return if (element !in elements){
            elements.add(element)
            println("Tarea agregada exitosamente")
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

    fun getAll(): List<T>{
        return elements
    }
   
}

//Main
fun fun main(args: Array<String>) {
    val listaTareas = CustomList<Tarea>()
    var ArbolTareas = ArbolTareas()
    var opcion: Int

    do{
        println("\nGestro de tareas")
        println("1. agregar tarea")
        println("2. eliminar tarea")
        println("3. ver lista de tareas")
        println("4. ver lista de tareas por prioridad")
        println("5. salir")
        println("Selecciona una opción: ")
        opcion = readLine()?.toIntOrNull()?:0

        when (opcion){
            1->{
                println("Ingrese el nombre de la tarea: ")
                val nuevaTarea = readLine()?: ""
                println("Ingrese la prioridad de la tarea: ")
                val nuevaTarea = readLine()?.toIntOrNull()?: 0
                var nuevaTarea = Tarea(nombre, prioridad)
                listaTareas.add(nuevaTarea)
                arbolTareas.insertar(nuevaTarea)
            }
            2->{
                if (listaTareas.size() > 0){
                    println("Seleccione la tarea que desea eliminar: ")
                    listaTareas.showAll()
                    println("Ingrese el nombre exacto de la tarea: ")
                    val eliminarTarea = readLine()? ""
                    var eliminarTarea = listaTareas.getAll().find{it.nombre == nombre}
                    if(eliminarTarea != null){
                        listaTareas.remove(eliminarTarea)
                    }
                    
                }else {
                    println("La tarea no esta en la lista")
                }
            }
            3->{
                listaTareas.showAll()
            }
            4->{
                println("Lista de tareas ordenadas por prioridad")
                ArbolTareas.mostrarEnOrden
            }
            5-> println("Saliste del programa...")

            else->println("Opción no valida, ingrese una opción valida.")
        }
    } while (opcion != 5)
}