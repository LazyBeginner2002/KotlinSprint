package org.example.lesson_4

const val MIN_ACCEPTABLE_NUMBER_OF_CREW = 55
const val RECOMMENDED_NUMBER_OF_CREW = 70
const val MIN_AMOUNT_OF_PROVISION = 51

fun main() {
    println("Введите входные данные: ")
    val presenceOfDamage = readln().toBoolean()
    val numberOfCrew = readln().toInt()
    val amountOfProvisions = readln().toInt()
    val favorableWeather = readln().toBoolean()

    val allowedToSail = (!presenceOfDamage &&
            (numberOfCrew in MIN_ACCEPTABLE_NUMBER_OF_CREW..RECOMMENDED_NUMBER_OF_CREW) &&
            (amountOfProvisions >= MIN_AMOUNT_OF_PROVISION)) ||
            ((numberOfCrew == RECOMMENDED_NUMBER_OF_CREW) && favorableWeather &&
                    (amountOfProvisions >= MIN_AMOUNT_OF_PROVISION))

    println("Корабль может отправиться в плавание - $allowedToSail")
}