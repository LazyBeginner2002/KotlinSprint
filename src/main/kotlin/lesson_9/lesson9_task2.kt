package org.example.lesson_9

fun main() {
    val ingredients = mutableListOf("Помидоры", "Огурцы", "Лук")
    println("В рецепте есть базовые ингредиенты: $ingredients")

    println("Желаете добавить еще?")
    val answer = readln()
    if (answer == "да") {
        println("Какой ингредиент вы хотите добавить?")
        val newIngredient = readln()
        ingredients.add(newIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: $ingredients")
    }
}