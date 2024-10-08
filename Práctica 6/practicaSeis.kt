import java.io.file

fun leerArchivo(ruta: String): String{
    val archivo = File(ruta)
    return archivo.readText()
}

fun escribirEnArchivos(ruta: String, content: String){
    val archivo = File(ruta)
    archivo.writeText(content)
}

fun fun main(args: Array<String>) {
    val ruta = "C:/Desktop/Practicas-Estructura-de-Datos--1/Práctica 6/archivo.txt"
    val contenido = leerArchivo(ruta)


    /*Ejemplo 1: Lectura de archivos */
    println(contenido)
    println("\n")

    /*Ejemplo 2: Escribir archivo */
    val escritura ="\nEsta es una prueba de appendText"
        
    escribirEnArchivos(ruta, escritura)
    println("Creado exitosamente")
}