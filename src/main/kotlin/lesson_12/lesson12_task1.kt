package org.example.lesson_12

fun main() {
    val temperatureOfMonday = TemperatureOfDay()
    temperatureOfMonday.daytimeTemperature = 13
    temperatureOfMonday.nightTemperature = 4
    temperatureOfMonday.presenceOfPrecipitationDuringTheDay = false
    temperatureOfMonday.printTemperatureInfo()

    val temperatureOfTuesday = TemperatureOfDay()
    temperatureOfTuesday.daytimeTemperature = 6
    temperatureOfTuesday.nightTemperature = -4
    temperatureOfTuesday.presenceOfPrecipitationDuringTheDay = true
    temperatureOfTuesday.printTemperatureInfo()
}

class TemperatureOfDay() {
    var daytimeTemperature: Byte = 0
    var nightTemperature: Byte = 0
    var presenceOfPrecipitationDuringTheDay = false

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