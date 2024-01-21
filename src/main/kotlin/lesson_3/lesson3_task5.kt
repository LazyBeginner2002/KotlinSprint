package org.example.lesson_3

fun main() {
    val moveInfo = "D2-D4;0"
    val parts = moveInfo.split('-', ';')

    println(parts[0])
    println(parts[1])
    println(parts[2])
}