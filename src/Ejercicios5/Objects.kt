package Ejercicios5

data class CarBrand(val name: String, val year: Int, val country: String)

fun createBrand(name: String, year: Int, country: String): CarBrand {
    return CarBrand(name, year, country)
}

fun main() {
    val brand1 = createBrand("BMW", 1897, "Alemania")
    val brand2 = createBrand("Toyota", 1937, "Japón")
    val brand3 = createBrand("Ford", 1903, "Estados Unidos")

    println(brand1)
    println(brand2)
    println(brand3)
}