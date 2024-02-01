package org.example.lesson_6

fun main() {
    var readLogin: String
    var readPassword: String

    println("Здравствуйте! Для начала работы пройдите регистрацию.\nВведите логин: ")
    val login = readln()
    println("Введите пароль: ")
    val password = readln()
    println("Повторите пароль: ")
    var repeatPassword = readln()
    while (repeatPassword != password) {
        println("Неверный пароль. Попробуйте еще раз.")
        repeatPassword = readln()
    }

    println("Регистрация прошла успешно! Войдите в аккаунт.")

    do {
        print("Введите логин: ")
        readLogin = readln()
        print("Введите пароль: ")
        readPassword = readln()
    } while ((readLogin != login) || (readPassword != password))

    println("Авторизация прошла успешно!")
}