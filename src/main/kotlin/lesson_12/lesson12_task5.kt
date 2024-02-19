package org.example.lesson_12

import kotlin.random.Random

const val NUMBER_OF_DAYS_IN_MONTH = 30

fun main() {
    val daysOfMonth = mutableListOf<TemperatureOfTheDayOfTheWeek>()

    repeat(NUMBER_OF_DAYS_IN_MONTH) {
        daysOfMonth.add(
            TemperatureOfTheDayOfTheWeek(
                Random.nextInt(-30, 30),
                Random.nextInt(-30, 30),
                Random.nextBoolean(),
            )
        )
    }

    val listOfDaytimeTemperature = daysOfMonth.map { it.daytimeTemperature }

    val listOfNightTemperature = daysOfMonth.map { it.nightTemperature }

    val daysWithPrecipitation = mutableListOf<TemperatureOfTheDayOfTheWeek>()
    daysOfMonth.forEach { if (it.presenceOfPrecipitationDuringTheDay) daysWithPrecipitation.add(it) }

    listOfDaytimeTemperature.average().also { println(it) }
    listOfNightTemperature.average().also { println(it) }
    daysWithPrecipitation.count { it.presenceOfPrecipitationDuringTheDay }.also { println(it) }
}

class TemperatureOfTheDayOfTheWeek(
    val daytimeTemperature: Int,
    val nightTemperature: Int,
    val presenceOfPrecipitationDuringTheDay: Boolean,
)
