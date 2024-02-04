package org.example.lesson_7

fun main() {
    val passwordAmountOfCharacters = 6
    var password = ""
    val alphabet = 'a'..'z'
    val numbers = '0'..'9'
    var a: Char

    for (i in 0 until passwordAmountOfCharacters) {
        if (i % 2 == 0) {
            a = alphabet.random()
        } else {
            a = numbers.random()
        }
        password += a
    }

    println(password)
}