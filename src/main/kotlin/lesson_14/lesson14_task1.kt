package org.example.lesson_14

fun main() {
    val liner1 = Ship()
    val cargoShip1 = CargoShip()
    val iceBreaker = IceBreaker()
}

open class Ship(
    val name: String = "Лайнер",
    val speedLvl: Int = 2,
    val numberOfPassengersLvl: Int = 3,
    val carryingCapacityLvl: Int = 2,
)

class CargoShip(
    name: String = "Грузовой корабль",
    speedLvl: Int = 1,
    numberOfPassengersLvl: Int = 2,
    carryingCapacityLvl: Int = 3,
) : Ship()

class IceBreaker(
    name: String = "Ледокол",
    speedLvl: Int = 1,
    numberOfPassengersLvl: Int = 2,
    carryingCapacityLvl: Int = 1,
    val crushIce: Boolean = true
) : Ship()