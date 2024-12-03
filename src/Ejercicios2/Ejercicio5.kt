package Ejercicios2

fun main() {
    println(checkChar())
}

fun checkChar(): Boolean {
    println("Introduce una frase:")
    val frase = readLine()!!.toString().lowercase()
    if (frase[0] == frase[frase.length-1] && frase[1] == frase[frase.length-2]){
        return true
    }
    return false
}