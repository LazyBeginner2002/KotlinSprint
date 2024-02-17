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
    daytimeTemperatureInKelvins: Int,
    nightTemperatureInKelvin: Int,
    presenceOfPrecipitationDuringTheDay: Boolean,
) {

    private val daytimeTemperature = daytimeTemperatureInKelvins - DIFFERENCE_BETWEEN_KELVIN_AND_CELSIUS_VALUES
    private val nightTemperature = nightTemperatureInKelvin - DIFFERENCE_BETWEEN_KELVIN_AND_CELSIUS_VALUES
    private val presenceOfPrecipitation = presenceOfPrecipitationDuringTheDay

    init {
        println(
            """
            Дневная температура: $daytimeTemperature
            Ночная температура: $nightTemperature
            Наличие осадков: $presenceOfPrecipitation
            
        """.trimIndent()
        )
    }
}