package org.example.lesson_5

fun main() {
    val firstWinNumber: UByte = 5u
    val secondWinNumber: UByte = 13u

    println("Введите ваши два числа:")
    val firstNumber = readln().toUByte()
    val secondNumber = readln().toUByte()

    if ((firstNumber == firstWinNumber) or (firstNumber == secondWinNumber)) {
        if ((secondNumber == firstWinNumber) or (secondNumber == secondWinNumber)) {
            println("Поздравляем! Вы выиграли главный приз!")
        } else {
            println("Вы выиграли утешительный приз!")
        }
    } else if((secondNumber == firstWinNumber) or (secondNumber == secondWinNumber)){
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

    println("Выигрышными числами являлись: $firstWinNumber и $secondWinNumber")
}