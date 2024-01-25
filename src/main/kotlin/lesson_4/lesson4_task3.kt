package org.example.lesson_4

const val SUNNY_WEATHER = true
const val OPENED_AWNING = true
const val AIR_HUMIDITY = 20
const val UNFAVORABLE_SEASON = "winter"

fun main() {
    val weatherSunny = true
    val awningOpened = true
    val currentSeason = "winter"
    val airHumidity = 20

    val favorableConditions = (weatherSunny == SUNNY_WEATHER) && (awningOpened == OPENED_AWNING) &&
            (currentSeason != UNFAVORABLE_SEASON) && (airHumidity == AIR_HUMIDITY)
    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}

