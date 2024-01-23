package org.example.lesson_4

fun main() {
    val presenceOfDamage = readln().toBoolean()
    val numberOfCrew = readln().toInt()
    val amountOfProvisions = readln().toInt()
    val favorableWeather = readln().toBoolean()

    val allowedToSail = (!presenceOfDamage && (numberOfCrew in 55..70) && (amountOfProvisions > 50)) ||
            ((numberOfCrew == 70) && favorableWeather && (amountOfProvisions > 50))

    println("Корабль может отправиться в плавание - $allowedToSail")
}