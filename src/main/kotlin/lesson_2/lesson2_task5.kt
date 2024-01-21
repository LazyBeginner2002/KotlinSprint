package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val amountOfMoney = 70_000
    val interestRate = 16.7
    val years = 20

    val amountOfSavings = ((1 + interestRate / 100).pow(years) * amountOfMoney)
    println("%.3f".format(amountOfSavings))
}
