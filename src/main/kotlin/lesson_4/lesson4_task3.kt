package org.example.lesson_4

fun main() {
    val weatherSunny = true
    val awningOpened = true
    val season = "winter"
    val airHumidity = 20

    val favorableConditions = weatherSunny && awningOpened && (season != "winter") && (airHumidity == 20)
    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}

