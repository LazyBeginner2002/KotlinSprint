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
    private var daytimeTemperature: Byte,
    private var nightTemperature: Byte,
    private var presenceOfPrecipitationDuringTheDay: Boolean,
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