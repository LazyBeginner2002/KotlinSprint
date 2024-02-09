package org.example.lesson_10

fun main() {
    println("Введите логин:")
    val login = readln()
    println("Введите пароль:")
    val password = readln()

    checkEnteredDataForLength(login, password)
}

fun checkEnteredDataForLength(login: String, password: String) {
    println(
        if (login.count() >= 4 && password.count() >= 4) "Добро пожаловать"
        else "Логин или пароль недостаточно длинные"
    )
}