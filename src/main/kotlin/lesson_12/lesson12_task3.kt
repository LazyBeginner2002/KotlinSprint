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
    daytimeTemperature: Int,
    nightTemperature: Int,
    presenceOfPrecipitationDuringTheDay: Boolean,
) {

    private val daytimeTemperature = daytimeTemperature - DIFFERENCE_BETWEEN_KELVIN_AND_CELSIUS
    private val nightTemperature = nightTemperature - DIFFERENCE_BETWEEN_KELVIN_AND_CELSIUS
    private val presenceOfPrecipitationDuringTheDay = presenceOfPrecipitationDuringTheDay

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
