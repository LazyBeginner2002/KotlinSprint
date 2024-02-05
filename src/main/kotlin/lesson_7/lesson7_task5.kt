package org.example.lesson_7

import kotlin.random.Random

fun main() {
    val minPasswordLength = 6
    val maxPasswordLength = readln().toInt()
    val password = StringBuilder()
    val characters = ('a'..'z') + ('A'..'Z') + ('0'..'9')

    for (i in 1..Random.nextInt(minPasswordLength, maxPasswordLength)) {
        password.append(characters.random())
    }

    println("password: $password")
}