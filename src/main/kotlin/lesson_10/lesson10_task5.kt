package org.example.lesson_10

const val MIN_DATA_LENGTH = 6
const val NUMBER_OF_CHARACTERS = 32

fun main() {
    val login = "SomeLogin"
    val password = "SomePassword"

    val token = authenticateAccount(login, password)
    if (token == null) println("Ошибка при авторизации") else println(showBasket(token))
}

fun authenticateAccount(login: String, password: String): String? {
    if (login.count() < MIN_DATA_LENGTH || password.count() < MIN_DATA_LENGTH) return null

    val lowerCase = 'a'..'z'
    val upperCase = 'A'..'Z'
    val numbers = '0'..'9'
    val characters = lowerCase + upperCase + numbers

    val token = StringBuilder()
    repeat(NUMBER_OF_CHARACTERS) {
        token.append(characters.random())
    }
    return token.toString()
}

fun showBasket(token: String): List<String> {
    val basket = listOf("Товар1", "Товар2", "Товар3", "Товар4")
    return basket
}