package Ejercicios2

fun main(){
    println("Resultado de concatenar las dos string introducidas: "+ concatenar())
}

fun concatenar(): String {
    println("Ingresa la primera cadena de texto a concatenar")
    val primeraString = readLine().toString().orEmpty()
    println("Ingresa la segunda cadena de texto a concatenar")
    val segundaString = readLine().toString().orEmpty()

    val resultado = primeraString + " " + segundaString
    return resultado
}
