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

    val listOfDaytimeTemperature = mutableListOf(0)
    for (i in 0..<NUMBER_OF_DAYS_IN_MONTH) {
        listOfDaytimeTemperature.add(daysOfMonth[i].daytimeTemperature)
    }
    listOfDaytimeTemperature.removeAt(0)

    val listOfNightTemperature: MutableList<Int> = mutableListOf(0)
    for (i in 0..<NUMBER_OF_DAYS_IN_MONTH) {
        listOfNightTemperature.add(daysOfMonth[i].nightTemperature)
    }
    listOfNightTemperature.removeAt(0)

    val daysWithPrecipitation = mutableListOf(daysOfMonth[0])
    for (i in 0..<NUMBER_OF_DAYS_IN_MONTH) {
        if (daysOfMonth[i].presenceOfPrecipitationDuringTheDay) daysWithPrecipitation.add(daysOfMonth[i])
    }
    daysWithPrecipitation.removeAt(0)

    listOfDaytimeTemperature.average().also { println(it) }
    listOfNightTemperature.average().also { println(it) }
    daysWithPrecipitation.count { it.presenceOfPrecipitationDuringTheDay }.also { println(it) }
}

class TemperatureOfTheDayOfTheWeek(
    val daytimeTemperature: Int,
    val nightTemperature: Int,
    val presenceOfPrecipitationDuringTheDay: Boolean,
)
