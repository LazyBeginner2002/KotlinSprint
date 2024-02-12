package org.example.lesson_10

const val MIN_DATA_LENGTH = 6

fun main() {
    val login = "SomeLogin"
    val password = "SomePassword"

    val token = authenticateAccount(login, password)
    if (token == null) println("Ошибка при авторизации") else println(showBasket(token))
}

fun authenticateAccount(login: String, password: String): String? {
    val lowerCase = 'a'..'z'
    val upperCase = 'A'..'Z'
    val numbers = '0'..'9'
    val characters = lowerCase + upperCase + numbers

    if (login.count() >= MIN_DATA_LENGTH && password.count() >= MIN_DATA_LENGTH) {
        val token = StringBuilder()
        repeat(32) {
            token.append(characters.random())
        }
        return token.toString()
    } else return null
}

fun showBasket(token: String): List<String> {
    val basket = listOf("Товар1", "Товар2", "Товар3", "Товар4")
    return basket
}