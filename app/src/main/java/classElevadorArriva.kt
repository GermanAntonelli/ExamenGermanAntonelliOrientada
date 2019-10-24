open class classElevadorArriva() {

    open fun showelevadorarriba(subiendo: Int) {
        if (subiendo == 0) {
            val piso = null
            if (piso == 0) {
                println("El elevador se ecuentra moviendose hacia Arriba en el primer piso el lobby")
            } else if (piso == -1) {
                println("El elevador se encuentra moviendose hacia arriba en el sotano S1")
            } else if (piso == -2) {
                println("El elevador se encuentra moviendose hacia arriba  en el sotano S2")
            } else if (piso == -3) {
                println("El elevador se encuentra moviendose hacia arriva  en el sotano S3")
            } else {
                println("El elevador de encuentra moviendose hacia arriva  en el piso: $piso")
            }
        }
    }
    }

