package main.kotlin

enum class Statetype{
    Arriba, Abajo, Detenido
}

open class classEdificio {
     fun movimiento(eleva: classElevador, mover: String) {
         if(mover < eleva.piso) {
             while(eleva.piso != mover) {
                 eleva.Abajo = Statetype.Abajo.toString()
                 eleva.showelevador()
                 eleva.piso -= 1
             }
         }
     }
    fun subir(eleva: Elevador, mover: Int)
    {

    }

    fun bajar(eleva: Elevador)
    {

    }
}

class Elevador {
    fun show() {
        println("el elevador se esta moviendo $")
    }
}

