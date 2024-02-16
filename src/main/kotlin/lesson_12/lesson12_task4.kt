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
    _daytimeTemperature: Int,
    _nightTemperature: Int,
    _presenceOfPrecipitationDuringTheDay: Boolean,
) {

    val daytimeTemperature = _daytimeTemperature - DIFFERENCE_BETWEEN_KELVIN_AND_CELSIUS_VALUES
    val nightTemperature = _nightTemperature - DIFFERENCE_BETWEEN_KELVIN_AND_CELSIUS_VALUES
    val presenceOfPrecipitationDuringTheDay = _presenceOfPrecipitationDuringTheDay

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