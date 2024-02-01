package org.example.lesson_6

import kotlin.random.Random

fun main() {
    println("Для входа в программу решите пример: ")
    val firstTerm = Random.nextInt(1,9)
    val secondTerm = Random.nextInt(1,9)
    var answer: Int

    print("$firstTerm + $secondTerm = ")
    var numberOfAttempts = 3
    while (numberOfAttempts > 0) {
        answer = readln().toInt()
        if (answer == firstTerm + secondTerm) {
            println("Добро пожаловать!")
            break
        } else {
            numberOfAttempts--
            println("Неверно. Осталось попыток $numberOfAttempts")
        }
    }
    if (numberOfAttempts == 0) println("Доступ запрещен")
}