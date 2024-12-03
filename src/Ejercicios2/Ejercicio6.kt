package Ejercicios2

fun main() {
    println(checkString())
}

fun checkString(): Any {
    println("Introduce una frase para comparar si es igual a otra frase: ")
    val frase = readLine()!!.toString().lowercase()
    println("Introduce otra frase para comparar si es igual a la anterior frase: ")
    val frase2 = readLine()!!.toString().lowercase()
    if (frase2 == frase) {
        return true
    }
    return false
}
