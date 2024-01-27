package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val winNumbers = List(3) { Random.nextInt(0, 42) }

    print("Введите первое число: ")
    val firstNumber = readln().toInt()
    print("Введите второе число: ")
    val secondNumber = readln().toInt()
    print("Введите третье число: ")
    val thirdNumber = readln().toInt()

    val userNumbers = listOf(firstNumber, secondNumber, thirdNumber)

    val winUserNumbers = userNumbers.intersect(winNumbers) // <- предлагает конвертировать в Set, т.к. порядок не важен

    val amountOfWinUserNumbers = winUserNumbers.size

    val winMessage = when (amountOfWinUserNumbers) {
        1 -> "Вы выиграли утешительный приз. Поздравляем!"
        2 -> "Поздравляем! Вы выиграли крупный приз!"
        3 -> "Поздравляем! Вы выграли джекпот!"
        else -> "Вы не угадали ни одно число."
    }

    println("\n$winMessage\nВыигрышными числами были: ${winNumbers[0]}, ${winNumbers[1]}, ${winNumbers[2]}")
}