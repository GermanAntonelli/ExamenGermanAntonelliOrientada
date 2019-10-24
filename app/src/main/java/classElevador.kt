package main.kotlin
import main.kotlin.Statetype

open class classElevador(var Detenido : String, var Arriba : String, var Abajo: String, var piso: String, var estado: Statetype) {

    open fun showelevador(){
            println("\nEl elevador se encuentra : $Detenido\nEstado del elevador: ${Arriba}a\n" +
                    "El elevador se encuentra en el lobby: $Abajo\n")

    }
  }

