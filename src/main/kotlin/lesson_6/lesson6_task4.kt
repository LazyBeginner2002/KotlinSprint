package org.example.lesson_6

import kotlin.random.Random

fun main() {
    val number = Random.nextInt(1, 9)
    var userNumber: Int

    var numberOfAttempts = 5
    while (numberOfAttempts > 0) {
        userNumber = readln().toInt()
        if (userNumber == number) {
            println("Это была великолепная игра!")
            break
        } else {
            numberOfAttempts--
            println("Неверно. Оставшееся кол-во попыток: $numberOfAttempts")
        }
    }
    println("Было загадано число $number")
}