class classElevadorAbajo {

    open fun showelevadorabajo() {
        if (abajo == 0) {
            val piso = null
            if (piso == 0) {
                println("El elevador se ecuentra bajando en el primer piso el lobby")
            } else if (piso == -1) {
                println("El elevador se encuentra bajando en el sotano S1")
            } else if (piso == -2) {
                println("El elevador se encuentra bajando en el sotano S2")
            } else if (piso == -3) {
                println("El elevador se encuentra bajando en el sotano S3")
            } else {
                println("El elevador de encuentra bajando en el piso: $piso")
            }
        }
    }
}
