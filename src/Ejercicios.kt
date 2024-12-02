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

