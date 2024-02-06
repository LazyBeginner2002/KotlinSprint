package org.example.lesson_7

fun main() {
    var passwordLength: Int
    do {
        passwordLength = readln().toInt()
    } while (passwordLength < 6)

    var password = StringBuilder()
    val lowerCase = 'a'..'z'
    val upperCase = 'A'..'Z'
    val numbers = '0'..'9'
    val characters: List<Char> = lowerCase + upperCase + numbers
    password.append(lowerCase.random())
    password.append(upperCase.random())
    password.append(numbers.random())

    for (i in 1..passwordLength-3) {
        password.append(characters.random())
    }

    println("password: $password")
}