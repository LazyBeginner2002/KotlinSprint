package org.example.lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {
    print("Введите год вашего рождения: ")
    val yearOfBirth = readln().toInt()
    val currentYear = 2024 // Год же можно считать за переменную, а не константу, раз ежегодно меняется)

    val userAge = currentYear - yearOfBirth
    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }
}