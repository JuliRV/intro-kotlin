package Ejercicios2

fun main(){
    delChar()
}
fun delChar() {
    println("Introduce una frase: ")
    val selected = readLine()!!
    println("Introduce el char a eliminar: ")
    val charSelected = readln()[0]
    if (selected.first().uppercaseChar() == charSelected.uppercaseChar()) {
        val result = selected.drop(1)
        println(result)
    } else if(selected.last().uppercaseChar() == charSelected.uppercaseChar()) {
        val result = selected.dropLast(1)
        println(result)
    } else {
        println("No se encuentra tu caracter introducido en el primer caracter ni en el último")
    }
}