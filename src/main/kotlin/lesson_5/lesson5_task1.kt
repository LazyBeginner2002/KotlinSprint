package org.example.lesson_5

fun main() {
    val firstTerm = 17
    val secondTerm = 34
    print("Доброго времени суток!\nДля входа в программу пройдите нашу имитацию капчи:\n$firstTerm + $secondTerm = ")
    val answer = readln().toInt()
    if (answer == firstTerm + secondTerm) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}