package org.example.lesson_12

import kotlin.random.Random

const val DIFFERENCE_BETWEEN_KELVIN_AND_CELSIUS_VALUES = 273
const val NUMBER_OF_DAYS_IN_MONTH = 30

fun main() {
    val daysOfMonth = mutableListOf<TemperatureOfTheDayOfTheWeek>()

    repeat(NUMBER_OF_DAYS_IN_MONTH) {
        daysOfMonth.add(
            TemperatureOfTheDayOfTheWeek(
                Random.nextInt(253, 313),
                Random.nextInt(243, 303),
                Random.nextBoolean(),
            )
        )
    }

    val listOfDaytimeTemperature = daysOfMonth.map { it.daytimeTemperature }

    val listOfNightTemperature = daysOfMonth.map { it.nightTemperature }

    listOfDaytimeTemperature.average().also { println(it) }
    listOfNightTemperature.average().also { println(it) }
    daysOfMonth.filter { it.presenceOfPrecipitationDuringTheDay }.also { println(it.size) }
}

class TemperatureOfTheDayOfTheWeek(
    daytimeTemperatureInKelvins: Int,
    nightTemperatureInKelvin: Int,
    val presenceOfPrecipitationDuringTheDay: Boolean,
) {
    val daytimeTemperature = daytimeTemperatureInKelvins - DIFFERENCE_BETWEEN_KELVIN_AND_CELSIUS_VALUES
    val nightTemperature = nightTemperatureInKelvin - DIFFERENCE_BETWEEN_KELVIN_AND_CELSIUS_VALUES
}
