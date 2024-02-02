package org.example.lesson_6

fun main() {
    print("Введите количество секунд, которые хотите засечь: ")
    val seconds = readln().toInt()

    var counter = 0
    while (counter < seconds) {
        println("Осталось секунд ${seconds - counter}")
        Thread.sleep(1000)
        counter++
    }

    println("Время вышло")
}