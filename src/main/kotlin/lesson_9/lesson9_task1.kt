package org.example.lesson_9

fun main() {
    val ingredients = listOf("Куриная грудка", "Масло", "Помидоры", "Лук", "Зелень", "Майонез", "Соль", "Перец")

    println("В списке есть следующие ингредиенты:")
    ingredients.forEach { println(it) }
}