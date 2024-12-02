import kotlin.time.times

fun sumaEj1(a: Int, b: Int): Int {
    return a + b
}

fun mulEj2(a: Int, b: Int): Int {
    return a * b
}

fun divEj3(dividendo: Int, divisor: Int): Double? {
    if (divisor != 0){
        return dividendo.toDouble() / divisor.toDouble()
    }else {
        return null
    }
}

fun divEj4(dividendo: Int, divisor: Int): Int? {
    if (divisor != 0){
        return dividendo / divisor
    }else {
        return null
    }
}

fun porcentajeEj5(total: Double, ganados: Double): Double {
    return ((ganados/total)*100)
}

fun mayorEj6 (a: Int, b: Int ): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

