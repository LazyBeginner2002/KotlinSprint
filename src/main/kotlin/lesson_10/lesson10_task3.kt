package org.example.lesson_10

fun main() {
    print("Введите длину пароля: ")
    val passwordLength = readln().toInt()

    println("Ваш пароль: ${generatePassword(passwordLength)}")
}

fun generatePassword (passwordLength: Int) : String {
    val password = StringBuilder()
    val numbers = '0'..'9'
    val specialSymbols = "!\"#\$%&'()*+,-./ "

    repeat(passwordLength/2) {
        password.append(numbers.random())
        password.append(specialSymbols.random())
    }
    if (passwordLength % 2 != 0) password.append(numbers.random())

    return password.toString()
}