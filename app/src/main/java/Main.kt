import main.kotlin.Statetype
import main.kotlin.classElevador

fun main(args: Array<String>){

    var classelevadorObject = classElevador("detenido", "arriba","abajo", "primero", Statetype.Abajo)
     classelevadorObject.showelevador()

    val classElevadorObjectDetenido = classElevadorDetenido()
    classElevadorObjectDetenido.showelevadorDetenido()

    val classElevadorAbajoObject = classElevadorAbajo()
    classElevadorAbajoObject.showelevadorabajo()

    val classElevadorArrivaObject = classElevadorArriva()
    //classElevadorAbajoObject.showelevadorarriba()

   
}