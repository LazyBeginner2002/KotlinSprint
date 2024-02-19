package org.example.lesson_12

fun main() {
    val temperatureOfWednesday = TemperatureOfDayOfWeek(
        3,
        -3,
        true,
    )
    temperatureOfWednesday.printTemperatureInfo()
}

class TemperatureOfDayOfWeek(
    private val daytimeTemperature: Byte,
    private val nightTemperature: Byte,
    private val presenceOfPrecipitationDuringTheDay: Boolean,
) {

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