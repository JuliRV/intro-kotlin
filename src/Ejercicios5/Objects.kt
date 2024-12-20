import java.util.Scanner

data class CarBrand(val name: String, val year: Int, val country: String)

fun createCarBrand(name: String, year: Int, country: String): CarBrand {
    return CarBrand(name, year, country)
}

data class Car(val model: String, val year: Int, val horsepower: Int, val brand: CarBrand)

fun createCar(model: String, year: Int, horsespower: Int, brand: CarBrand): Car {
    return Car(model, year, horsespower, brand)
}

data class Character(val name: String, var health: Int, val attack: Int, val defense: Int, val race: String) {
    fun reduceHealth(damage: Int) {
        val actualDamage = damage - defense
        health -= if (actualDamage > 0) actualDamage else 0
    }
}

fun createCharacter(name: String, health: Int, attack: Int, defense: Int, race: String): Character {
    return Character(name, health, attack, defense, race)
}

fun attack(attacker: Character, defender: Character) {
    defender.reduceHealth(attacker.attack)
    println("${attacker.name} ataca a ${defender.name} y reduce su salud a ${defender.health}")
}

open class Spaceship(val name: String, var health: Int, var tripulation: Int)

class Fighter(name: String, health: Int, tripulation: Int, var shots: Int) : Spaceship(name, health, tripulation) {
    fun shoot() {
        if (shots > 0) {
            shots--
            println("$name dispara. Quedan $shots disparos.")
        } else {
            println("$name no tiene disparos restantes.")
        }
    }
}

class Carrier(name: String, health: Int, tripulation: Int, var fighters: Int, var shots: Int) : Spaceship(name, health, tripulation) {
    fun shoot() {
        if (shots > 0) {
            shots--
            println("$name dispara. Quedan $shots disparos.")
        } else {
            println("$name no tiene disparos restantes.")
        }
    }

    fun launchFighter() {
        if (fighters > 0) {
            fighters--
            println("$name lanza un caza. Quedan $fighters cazas.")
        } else {
            println("$name no tiene cazas restantes.")
        }
    }
}

open class Animal(val name: String, val species: String)

class Dog(name: String) : Animal(name, "Perro")
class Bird(name: String) : Animal(name, "Pájaro")
class Whale(name: String) : Animal(name, "Ballena")

data class User(val username: String, val role: String)
data class Admin(val username: String, val permissions: List<String>)

fun main() {
    val scanner = Scanner(System.`in`)
    var option: Int

    do {
        println("Selecciona un ejercicio para probar:")
        println("1. Crear marca de coche")
        println("2. Crear coche")
        println("3. Crear personaje")
        println("4. Atacar a un personaje")
        println("5. Disparar desde una pave")
        println("6. Lanzar un caza desde un portacazas")
        println("7. Crear animales")
        println("8. Crear usuario/admin")
        println("0. Salir")

        print("Ingresa tu opción: ")
        option = scanner.nextInt()

        when (option) {
            1 -> {
                val brand = createCarBrand("BMW", 1897, "Alemania")
                println(brand)
            }
            2 -> {
                val car = createCar("325", 2007, 250, createCarBrand("BMW", 1897, "Alemania"))
                println(car)
            }
            3 -> {
                val character = createCharacter("Hero", 100, 20, 5, "Humano")
                println(character)
            }
            4 -> {
                val attacker = createCharacter("Hero", 100, 20, 5, "Humano")
                val defender = createCharacter("Villano", 100, 15, 3, "Orco")
                attack(attacker, defender)
            }
            5 -> {
                val fighter = Fighter("Caza", 100, 1, 5)
                fighter.shoot()
            }
            6 -> {
                val carrier = Carrier("Porta-Cazas", 200, 5, 3, 5)
                carrier.launchFighter()
            }
            7 -> {
                val dog = Dog("Rex")
                println("Animal creado: ${dog.name}, especie: ${dog.species}")
            }
            8 -> {
                val user = User("usuario1", "usuario")
                val admin = Admin("admin1", listOf("crear", "eliminar"))
                println("Usuario creado: ${user.username}, rol: ${user.role}")
                println("Admin creado: ${admin.username}, permisos: ${admin.permissions}")
            }
            0 -> println("Saliendo...")
            else -> println("Opción no válida. Intenta de nuevo.")
        }
    } while (option != 0)
}