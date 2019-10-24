class classElevadorDetenido {

    open fun showelevadorDetenido() {
        if (detenido == 0) {
            val piso = null
            if (piso == 0) {
                println("El elevador se ecuentra Detenido en el primer piso el lobby")
            } else if (piso == -1) {
                println("El elevador se encuentra detenido en el sotano S1")
            } else if (piso == -2) {
                println("El elevador se encuentra detenido en el sotano S2")
            } else if (piso == -3) {
                println("El elevador se encuentra detenido en el sotano S3")
            } else {
                println("El elevador de encuentra detenido en el piso: $piso")
            }
        }
    }
}