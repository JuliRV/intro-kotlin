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

fun volPiscinaEj7(ancho: Int, largo: Int, alto: Int): Int {
    return ancho * largo * alto
}

fun esPrimoEj8(num: Int): Boolean {
    if (num < 1) return false
    for (j in 2 until num) {
        if (num % j == 0) return false
    }
    return true
}

fun primerosPrimosEj8(x: Int) {
    var contador = 0
    var num = 1
    while (contador < x) {
        if (esPrimoEj8(num)) {
            print(num)
            print(", ")
            contador++
        }
        num++
    }
}

