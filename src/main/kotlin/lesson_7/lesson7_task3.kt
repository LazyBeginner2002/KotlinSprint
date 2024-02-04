package org.example.lesson_7

fun main() {
    print("Введите число: ")
    val userNumber = readln().toInt()
    val evenNumbers = 0..userNumber step 2

    for (i in evenNumbers) println(i)
}