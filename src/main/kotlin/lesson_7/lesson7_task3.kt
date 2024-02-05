package org.example.lesson_7

fun main() {
    print("Введите число: ")
    val userNumber = readln().toInt()

    for (i in 0..userNumber step 2) println(i)
}