package org.example.lesson_12

const val DIFFERENCE_BETWEEN_KELVIN_AND_CELSIUS_VALUES = 273

fun main() {
    val temperatureOfFriday = TemperatureOfTheDayOfAWeek(
        300,
        290,
        false
    )
}

class TemperatureOfTheDayOfAWeek(
    daytimeTemperature: Int,
    nightTemperature: Int,
    presenceOfPrecipitationDuringTheDay: Boolean,
) {

    val daytimeTemperature = daytimeTemperature - DIFFERENCE_BETWEEN_KELVIN_AND_CELSIUS_VALUES
    val nightTemperature = nightTemperature - DIFFERENCE_BETWEEN_KELVIN_AND_CELSIUS_VALUES
    val presenceOfPrecipitationDuringTheDay = presenceOfPrecipitationDuringTheDay

    init {
        println(
            """
            Дневная температура: $daytimeTemperature
            Ночная температура: $nightTemperature
            Наличие осадков: $presenceOfPrecipitationDuringTheDay
            
        """.trimIndent()
        )
    }
}