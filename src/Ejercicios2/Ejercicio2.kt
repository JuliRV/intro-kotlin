package Ejercicios2

fun main(){
    changeChar()
}

fun changeChar() {
    println("Introduce una frase")
    val introduced = readlnOrNull()
    println("La frase es: $introduced")
    val changeChar = introduced!!.replace('a','i')
        .replace('a'.uppercaseChar(),'i'.uppercaseChar())
    val result = println("La frase con los caracteres cambiados es: " + changeChar)
    return result
}