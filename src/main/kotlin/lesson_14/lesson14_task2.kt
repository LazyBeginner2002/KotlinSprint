package org.example.lesson_14

fun main() {
    val liner1 = Ships()
    val cargoShip1 = CargoShips()
    val iceBreaker1 = IceBreakers()
    liner1.prepareForLoading()
    cargoShip1.prepareForLoading()
    iceBreaker1.prepareForLoading()
    liner1.printInfoAboutTheShip()
    cargoShip1.printInfoAboutTheShip()
    iceBreaker1.printInfoAboutTheShip()
}

open class Ships(
    val name: String = "Лайнер",
    val speedLvl: Int = 2,
    val numberOfPassengersLvl: Int = 3,
    val carryingCapacityLvl: Int = 2,
) {
    open fun prepareForLoading() {
        println("Горизонатальный трап со шкафута выдвинут")
    }

    open fun printInfoAboutTheShip() {
        println(
            """
            Название корабля: $name
            Уровень скорости: $speedLvl
            Уровень вместимости пассажиров: $numberOfPassengersLvl
            Уровень грузоподъемности: $carryingCapacityLvl
        """.trimIndent()
        )
    }
}

class CargoShips(
    name: String = "Грузовой корабль",
    speedLvl: Int = 1,
    numberOfPassengersLvl: Int = 2,
    carryingCapacityLvl: Int = 3,
) : Ships(name, speedLvl, numberOfPassengersLvl, carryingCapacityLvl) {
    override fun prepareForLoading() {
        println("Погрузочный кран активирован")
    }

    override fun printInfoAboutTheShip() {
        super.printInfoAboutTheShip()
    }
}

class IceBreakers(
    name: String = "Ледокол",
    speedLvl: Int = 1,
    numberOfPassengersLvl: Int = 2,
    carryingCapacityLvl: Int = 1,
    val crushIce: Boolean = true
) : Ships(name, speedLvl, numberOfPassengersLvl, carryingCapacityLvl) {
    override fun prepareForLoading() {
        println("Ворота со стороны кормы открыты")
    }

    override fun printInfoAboutTheShip() {
        super.printInfoAboutTheShip()
        println("Может колоть лед")
    }
}