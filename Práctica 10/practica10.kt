class nodo ( val pregunta: String, val respuesta: String? = null){
    val izquierado: Nodo? = null
    val derecho: Nodo? = null
}

class ArbooBinarioRPG{
    val raiz : Nodo? = null

    init {
        val mago = Nodo("", "Eres un Mago")
        val arquero = Nodo("", "Eres un Arquero")
        val guerrero = Nodo("", "Eres un Guerrero")
        val asesino = Nodo("", "Eres un Asesino")

        val magia = Nodo("Prefieres usar mágia?")
        magia.izquierdo = mago
        magia.derecho = arquero

        val armas = Nodo("Prefieres usar armas?")
        armas.izquierdo = guerrero
        armas.derecho = asesino

        raiz = Nodo("Priferes combate a distancia?")
        raiz.izquierdo = magia
        raiz.derecho = armas
    }
}

class juego(nodo: Nodo?){
    if (nodo == null) return

    if (nodo.clase != null){
        println(nodo.clase)
        return
    }

    println(nodo.pregunta + "(si/no)")
    val respuesta = readline()?.lowercase()

    if(respuesta == "si"){
        juego(no.izquierdo)
    }else {
        juego(nodo.derecho)
    }
}

fun fun main(args: Array<String>) {
    val jugador = ArbooBinarioRPG()
    println("Bienvenido al test de clase de RPG!")
    jugador(juego.raiz)
}