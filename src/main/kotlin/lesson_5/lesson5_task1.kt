package org.example.lesson_5

fun main() {
    print("Доброго времени суток!\nДля входа в программу пройдите нашу имитацию капчи:\n17 + 34 = ")
    val answer = readln().toInt()
    if (answer == 51) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}