package org.example.lesson_10

import kotlin.random.Random

fun main() {
    var humanScore: Int
    var robotScore: Int
    var humanWinCounter = 0

    do {
        humanScore = rollDice()
        println("Ход человека...\nВыпавшее число: $humanScore\n")

        robotScore = rollDice()
        println("Ход робота...\nВыпавшее число: $robotScore\n")

        if (robotScore < humanScore) humanWinCounter++

        println(
            when {
                robotScore < humanScore -> "Победило человечество"
                robotScore > humanScore -> "Победила машина"
                else -> "Ничья"
            }
        )

    } while (nextRound())

    println("Количество побед: $humanWinCounter")
}

fun rollDice(): Int {
    return Random.nextInt(1, 6)
}

fun nextRound() : Boolean {
    println("\nХотите бросить кости еще раз? Введите \"Да\" или \"Нет\"")
    val answer = readln()

    return answer.equals("да", true)
}