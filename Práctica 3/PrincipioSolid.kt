//Principio SOLID
/*
1. Single responsability Principle (SRP)
*/

//Ejemplo de no uso de SRP
/*
class factura (val items: List<Item>){
    fun calcularTotal(): Double{
        return items.sumOf {it.precio}
    }

    fun generarReporte(): String{
        return "Reporte de la factura"
    }
}
 */

 //

 class factura (val items: List<Item>){
    fun calcularTotal(): Double{
        return items.sumOf {it.precio}
    }

    fun generarReporte(): String{
        return "Reporte de la factura"
    }
}

/*
2. Open/Clodes Principles (OCP)*/

open class Empleado(val nombre: String, val horasTrabajadas: Int, val precioHora: Double){
    open fun calcularSalario(): Double{
        return horasTrabajadas*precioHora
    }
}

class EmpleadoconBono (nombre: String, horasTrabajadas: Int, precioHora: Double, val bono: Double): Empleado(nombre, horasTrabajadas, precioHora){
    override fun calcularSalario(): Double{
        return super.calcularSalario + bono
    }
}

/*
3. Liskov Substitution Principle (LSP) */

fun fun main(args: Array<String>) {
    fun imprimirSalario(empleado: Empleado){
        println ("El salario de ${empleado.nombre} es de ${empleado.calcularSalario()}")
    }

    val empleado = Empleado("Chelsea", 40, 12.0)
    val empleadoConBono = EmpleadoconBono("Mariana", 40, 12.0, 70)

    imprimirSalario(empleado)
    imprimirSalario(empleadoConBono)
}

/*
4. Interface Segregation Principle*/

interface Trabajado{
    fun trabajar()
}

interface Asistente{
    fun asistir()
}

interface Reportero{
    fun generarReporte()
}

class Programador: Trabajador{
    override fun trabajar(){
        println("El programador esta programando")
    }
}

class Albañil: Trabajador{
    override fun trabajar(){
        println("El albañil esta construyendo")
    }
}

/*
5. Dependency Inversion Principle*/

interface Notificaciones{
    fun enviarNotificacion(mensaje: String)
}

class ServicioEmail:Notificaciones{
    override fun enviarNotificacion(mensaje: String){
        println("Enviando Email: $mensaje")
    }
}

class Notificacion(val servicio:Notificaciones){
    fun enviarNotificacion(){
        servicio.enviarNotificacion("Notificación importante")
    }
}