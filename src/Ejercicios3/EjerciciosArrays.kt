package Ejercicios3

import kotlin.random.Random.Default.nextInt

fun main (){
    println("Lista de ejercicios:: \n" +
            "Ejercicio 1\n" +
            "Crea una función que dado un array de números inserte un número en una posición designada. Devuelve el nuevo array o null en caso de que no sea posible\n" +
            "\n" +
            "Ejercicio 2\n" +
            "Crea una función que dado un conjunto de enteros devuelva si existe un número dentro de él\n" +
            "\n" +
            "Ejercicio 3\n" +
            "Crea una función que dado un conjunto de enteros devuelva el número de veces que se repite un número dado\n" +
            "\n" +
            "Ejercicio 4\n" +
            "Crea una función que dado un conjunto de enteros los ordene de mayor a menor y devuelva el array resultante. NO SE PUEDE USAR SORT\n" +
            "\n" +
            "Ejercicio 5\n" +
            "Crea una función que dado un conjunto de String añada un nuevo elemento que se le pase y devuelva el nuevo array\n" +
            "\n" +
            "Ejercicio 6\n" +
            "Crea una función que dado un conjunto de Int devuelva el primer número entre 1 y 1000000 que no se encuentre dentro del array\n" +
            "\n"+
            "Cuál quieres resolver hoy? ")

    val selected = readlnOrNull()?.toIntOrNull()
    when (selected) {
        1 -> ejercicio1()
        2 -> ejercicio2()
        3 -> ejercicio3()
        4 -> ejercicio4()
        5 -> ejercicio5()
        6 -> ejercicio6()
        else -> println("Por favor selecciona un ejercicio válido del 1 al 6:")
    }
}

fun ejercicio1(): ArrayList<Int>? {
    val numArrayList = arrayListOf(1,2,3,4,5)
    println("Nuestro array es: $numArrayList")

    println("Inserta un nuevo nº al array:")
    val newNum = readln()?.toIntOrNull()
    println("Inserta otro numero para la posicion que ocupara en el array: ")
    val positionNum = readln()?.toIntOrNull()

    if (positionNum != null && newNum != null && positionNum in 0 .. numArrayList.size) {
        numArrayList.add(positionNum, newNum)
        println("El array con un $newNum insertado en la posicion $positionNum queda así: " + numArrayList)
    }else{
        println("Error, asegurate de haber introducido un nº válido y una posicion válida")
        return null
    }
    val resultArray = numArrayList
    return resultArray
}

fun ejercicio2(): Boolean {
    val numArrayList = arrayListOf(1,2,3,4,5)
    println("Nuestro array es: $numArrayList")

    println("Inserta un número para ver si existe: ")
    val newNum = readln()?.toIntOrNull()
    if (newNum != null && newNum in 0 .. numArrayList.size) {
        println("Existe $newNum?")
        val exists = numArrayList.contains(newNum)
        println(exists)
        return true
    }else{
        println("El número introducido no existe en el array, prueba con otro")
        return false
    }
}

fun ejercicio3() {
    val numArrayList = arrayListOf(1,3,3,4,5)
    println("Nuestro array es: $numArrayList")

    println("Insert número para ver cuantas veces se repite en el array:")
    val newNum = readln()?.toIntOrNull()
    var contador = 0
    if (newNum != null && newNum in 0 .. numArrayList.size) {
        println("El número $newNum se repite este número de veces:")
        for (i in numArrayList.indices) {
            if (numArrayList[i] == newNum) {
                contador += 1
            }
        }
        println(contador)
    }
}

fun ejercicio4() {
    println("Introduce un conjunto de enteros separados por coma para que los ordene de mayor a menor")
    val newNumbers = readln()
    if (newNumbers.isNotEmpty()) {
        val numeros = newNumbers.split(",").map { it.trim().toInt() }.toIntArray()
        for (i in numeros.indices) {
            var max = i
            for (j in i + 1 until numeros.size) {
                if (numeros[j] > numeros[max]) {
                    max = j
                }
            }
            val temp = numeros[i]
            numeros[i] = numeros[max]
            numeros[max] = temp
        }
        println("Números ordenados de mayor a menor: ${numeros.joinToString(", ")}")
    }
}

fun ejercicio5() {
    val numArrayList = arrayListOf(1,2,3,4,5,"ee")
    println("Escribe una cadena de texto, letra o número que desees añadir como string al array")
    val newToArray = readln().trim()
    if (newToArray.contains(',')) {
        println("ERROR, no se permiten comas en la string (prueba sin poner ',')")}else {
        if (newToArray != null && newToArray.isNotEmpty()) {
            numArrayList.add(newToArray)
        }
    }
    println("El array final es: $numArrayList")
}

fun ejercicio6() {
    println("Introduce un conjunto de enteros salteados:")
    val newNumbers = readln().trim()
    if (newNumbers.isNotEmpty()) {
        val numeros = newNumbers.split(",").map { it.trim().toInt() }.toIntArray()
        for(i in 1..1000000){
            if(i !in numeros){
                println("El primer numero que falta es: $i")
                return
            }
        }
    }
}

