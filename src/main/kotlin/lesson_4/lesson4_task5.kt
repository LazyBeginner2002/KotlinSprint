package org.example.lesson_4

const val MIN_ACCEPTABLE_NUMBER_OF_CREW = 55
const val RECOMMENDED_NUMBER_OF_CREW = 70
const val MIN_AMOUNT_OF_PROVISION = 51

fun main() {
    println("Введите данные:")
    print("- Наличие повреждений: ")
    val isShipDamaged = readln().toBoolean()
    print("- Количество экипажа: ")
    val numberOfCrew = readln().toInt()
    print("- Количество провизии(шт. ящиков): ")
    val amountOfProvisions = readln().toInt()
    print("- Благоприятная погода: ")
    val isWeatherFavorable = readln().toBoolean()

    val allowedToSail = (!isShipDamaged &&
            (numberOfCrew in MIN_ACCEPTABLE_NUMBER_OF_CREW..RECOMMENDED_NUMBER_OF_CREW) &&
            (amountOfProvisions >= MIN_AMOUNT_OF_PROVISION)) ||
            ((numberOfCrew == RECOMMENDED_NUMBER_OF_CREW) && isWeatherFavorable &&
                    (amountOfProvisions >= MIN_AMOUNT_OF_PROVISION))

    println("Корабль может отправиться в плавание - $allowedToSail")
}