package org.example.lesson_5

fun main() {
    val firstWinNumber: UByte = 5u
    val secondWinNumber: UByte = 13u

    println("Введите ваши два числа:")
    val firstNumber = readln().toUByte()
    val secondNumber = readln().toUByte()

    when {
        ((firstNumber == firstWinNumber) || (firstNumber == secondWinNumber)
                && (secondNumber == firstWinNumber) || (secondNumber == secondWinNumber))
        -> println("Поздравляем! Вы выиграли главный приз!")

        ((firstNumber == firstWinNumber) || (firstNumber == secondWinNumber)
                || (secondNumber == firstWinNumber) || (secondNumber == secondWinNumber))
        -> println("Вы выиграли утешительный приз!")

        else -> println("Неудача!")
    }

    println("Выигрышными числами являлись: $firstWinNumber и $secondWinNumber")
}