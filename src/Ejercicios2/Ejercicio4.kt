package Ejercicios2

fun main(){
    duplicate2firstChars()
}
fun duplicate2firstChars(){
    println("Escribe una cadena de texto:")
    val textIntroduced = readLine()!!.toString()
    val result = textIntroduced.substring(0, 2)
    println(result+result)
}