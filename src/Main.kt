//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //1. Tipos de datos

    //Enteros
    val integer: Int = 30
    val long: Long = 1000000000L

    //Flotantes
    val float: Float = 0.2f
    val double: Double = 3.14159265358979

    //Booleanos
    val booleanTrue: Boolean = true
    val booleanFalse: Boolean = false

    //Caracteres (Char)
    val characterC: Char = 'C'

    //Cadenas (String)
    val myText: String = "Hello World"

    //Imprimir por terminal
    println("Mensaje:" + myText)
    println("isFavorite:" + booleanTrue)
    println("Entero:" + integer)

    //2.Bucle
    //For (y derivados), While, Do-While
    for (i in 1..5){
        println("Value for i: " + i)
    }
    var value: Int = 10
    var value2: Int = 11
    while (value < value2) {
      value++
        value.inc()
        value = value+1
        value+=1
        println("Hi")
    }
    do {
        value++
    }while (value > 5)


    //When(Cases) <- Switch
    val day = 3
    when (day) {
        1-> println("Lunes")
        2-> println("Martes")
        3-> println("Miercoles")
        4-> println("Jueves")
        5-> println("Viernes")
        6-> println("Sabado")
        7-> println("Domingo")
        else -> {
            println("Nada, error dia no valido")
        }
    }

    val resultadoEj1 = sumaEj1(a = 20, b = 30)
    println("El resultado del ej1 es: " + resultadoEj1)

    val resultadoEj2 = mulEj2(a = 20, b = 30)
    println("El resultado del ej2 es: " + resultadoEj2)

    var resultadoEj3 = divEj3(dividendo = 20, divisor = 3)
    println("El resultado del ej3.1 es: " + resultadoEj3)
    resultadoEj3 = divEj3(dividendo = 20, divisor = 0)
    println("El resultado del ej3.2 es: " + resultadoEj3)


}