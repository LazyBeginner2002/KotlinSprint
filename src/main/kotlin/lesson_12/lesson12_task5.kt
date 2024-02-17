package org.example.lesson_12

import kotlin.random.Random

const val NUMBER_OF_DAYS_IN_MONTH = 30

fun main() {
    var daytimeTemperatureData = Random.nextInt(-30, 30)
    var nightTemperatureData = Random.nextInt(-30, 30)
    var presenceOfPrecipitationData = Random.nextBoolean()

    var dayOfMonth: TemperatureOfTheDayOfTheWeek

    val daysOfMonth = mutableListOf(
        TemperatureOfTheDayOfTheWeek(
            daytimeTemperatureData,
            nightTemperatureData,
            presenceOfPrecipitationData
        )
    )

    repeat(NUMBER_OF_DAYS_IN_MONTH - 1) {
        daytimeTemperatureData = Random.nextInt(-30, 30)
        nightTemperatureData = Random.nextInt(-30, 30)
        presenceOfPrecipitationData = Random.nextBoolean()
        dayOfMonth = TemperatureOfTheDayOfTheWeek(
            daytimeTemperatureData,
            nightTemperatureData,
            presenceOfPrecipitationData
        )
        daysOfMonth.add(dayOfMonth)
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

    val averageDaytimeTemperatureOfMonth = listOfDaytimeTemperature.average().also { println(it) }
    val averageNightTemperatureOfMonth = listOfNightTemperature.average().also { println(it) }
    val numberOfDaysWithPrecipitation =
        daysWithPrecipitation.count { it.presenceOfPrecipitationDuringTheDay }.also { println(it) }
}

class TemperatureOfTheDayOfTheWeek(
    _daytimeTemperature: Int,
    _nightTemperature: Int,
    _presenceOfPrecipitationDuringTheDay: Boolean,
) {
    val daytimeTemperature = _daytimeTemperature
    val nightTemperature = _nightTemperature
    val presenceOfPrecipitationDuringTheDay = _presenceOfPrecipitationDuringTheDay
}