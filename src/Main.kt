import Ejercicios1.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // Condicionales
    var valueA = 2
    var valueB = 7
    if (valueA > valueB) {
        // Si se cumple, procede a la lógica
        if(valueB == 3) {
            //Haz esto...
        } else {
            //Sino aquello...
        }
    } else {
        //Sino se cumple el argumento...
        // Procede aqui.
    }

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

    var resultadoEj4 = divEj4(dividendo = 5, divisor = 2)
    println("El resultado del ej4.1 es: " + resultadoEj4)
    resultadoEj4 = divEj4(dividendo=20, divisor = 0)
    println("El resultado del ej4.2 es: " + resultadoEj4)

    val resultadoPorcentajeEj5 = porcentajeEj5(total=30.0, ganados=3.0)
    println("El resultado del ej5 es: " + resultadoPorcentajeEj5 +"%")

    var resultadoEj6 = mayorEj6(a = 20, b = 30)
    println("El resultado del ej6.1 es: " + resultadoEj6)
    resultadoEj6 = mayorEj6(a = 3, b = 0)
    println("El resultado del ej6.2 es: " + resultadoEj6)

    val resultadoEj7 = volPiscinaEj7(4,4,3)
    println("El resultado del ej7 es: " + resultadoEj7)

    val x = 5
    print("Los primeros $x numeros primos son: " )
    primerosPrimosEj8(x)

}