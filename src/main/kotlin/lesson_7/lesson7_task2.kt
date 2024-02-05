package org.example.lesson_7

import kotlin.random.Random

fun main() {
    var userAuthCode = Random.nextInt(1000, 9999)
    println("Ваш код авторизации: $userAuthCode")

    println("Введите код авторизации")
    var authCode = readln().toInt()

    while (authCode != userAuthCode) {
        userAuthCode = Random.nextInt(1000, 9999)
        println("Ваш код авторизации: $userAuthCode")

        println("Введите код авторизации")
        authCode = readln().toInt()
    }

    println("Добро пожаловать!")
}