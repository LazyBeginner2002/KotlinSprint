package org.example.lesson_10

import kotlin.random.Random

fun main() {
    do {
        val humanScore = rollTheDice()
        println("Ход человека...\nВыпавшее число: $humanScore\n")

        val robotScore = rollTheDice()
        println("Ход робота...\nВыпавшее число: $robotScore\n")

        println(
            when {
                robotScore < humanScore -> "Победило человечество"
                robotScore > humanScore -> "Победила машина"
                else -> "Ничья"
            }
        )

        println("\nЕще раунд?")
        val playNextRound = readln().toBoolean()
    } while (playNextRound)
}

fun rollTheDice(): Int {
    return Random.nextInt(1, 6)
}