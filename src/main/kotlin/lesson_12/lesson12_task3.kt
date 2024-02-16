package org.example.lesson_12

const val DIFFERENCE_BETWEEN_KELVIN_AND_CELSIUS = 273

fun main() {
    val temperatureOfThursday = TemperatureOfTheDayOfWeek(
        300,
        290,
        false
    )
    temperatureOfThursday.printTemperatureInfo()
}

class TemperatureOfTheDayOfWeek(
    _daytimeTemperature: Int,
    _nightTemperature: Int,
    _presenceOfPrecipitationDuringTheDay: Boolean,
) {

    val daytimeTemperature = _daytimeTemperature - DIFFERENCE_BETWEEN_KELVIN_AND_CELSIUS
    val nightTemperature = _nightTemperature - DIFFERENCE_BETWEEN_KELVIN_AND_CELSIUS
    val presenceOfPrecipitationDuringTheDay = _presenceOfPrecipitationDuringTheDay

    fun printTemperatureInfo() {
        println(
            """
            Дневная температура: $daytimeTemperature
            Ночная температура: $nightTemperature
            Наличие осадков: $presenceOfPrecipitationDuringTheDay
            
        """.trimIndent()
        )
    }
}
