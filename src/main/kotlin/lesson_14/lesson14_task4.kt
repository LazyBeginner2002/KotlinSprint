package org.example.lesson_14

fun main() {
    val planetFabric = Fabric()

    println("Введите название планеты: ")
    val planetName = readln()
    println("Введите количество спутников у планеты $planetName")
    val numberOfPlanetSatellites = readln().toInt()

    val planet1 = planetFabric.createNewPlanet(planetName, numberOfPlanetSatellites)
    planet1.printInfo()
}

abstract class HeavenlyBody(
    val name: String,
    val atmosphere: Boolean,
    val suitableForLanding: Boolean,
)

class Planet(
    name: String,
    atmosphere: Boolean,
    suitableForLanding: Boolean,
    private val satellites: MutableList<Satellite>,
) : HeavenlyBody(name, atmosphere, suitableForLanding) {
    fun printInfo() {
        println(
            """
            Название планеты: $name
            Наличие атмосферы у планеты $name: $atmosphere
            Пригодность для посадки на поверхность планеты $name: $suitableForLanding
            Спутники планеты $name: ${satellites.map { it.name }}
        """.trimIndent()
        )
    }
}

class Satellite(
    name: String,
    atmosphere: Boolean,
    suitableForLanding: Boolean
) : HeavenlyBody(name, atmosphere, suitableForLanding)

class Fabric {
    fun createNewPlanet(name: String, numberOfSatellites: Int): Planet {
        println("Наличие атмосферы у планеты $name: ")
        val atmosphere = readln().toBoolean()

        println("Пригодность посадки на поверхность планеты $name: ")
        val suitableForLanding = readln().toBoolean()

        val listOfSatellites = mutableListOf<Satellite>()
        for (i in 1..numberOfSatellites) {
            println("Введите название $i спутника: ")
            listOfSatellites.add(createNewSatellite(readln()))
        }
        return Planet(name, atmosphere, suitableForLanding, listOfSatellites)
    }

    private fun createNewSatellite(name: String): Satellite {
        println("Наличие атмосферы у спутника $name: ")
        val atmosphere = readln().toBoolean()

        println("Пригодность посадки на поверхность спутника $name: ")
        val suitableForLanding = readln().toBoolean()

        return Satellite(name, atmosphere, suitableForLanding)
    }
}