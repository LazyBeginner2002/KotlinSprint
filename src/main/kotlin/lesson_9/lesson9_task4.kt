package org.example.lesson_9

fun main() {
    val numberOfIngredients = 5
    val ingredients = mutableListOf("someString")
    println("Введите список из $numberOfIngredients ингредиентов(разделяя их запятой):")
    val userIngredients = readln().split(", ")

    userIngredients.forEach { ingredients.add(it) }
    ingredients.removeAt(0)
    ingredients.sort()
    ingredients.forEach { println(it) }
} // Пояснение к 5 и 12 строчке - сделал так, потому что при вызове метода add() IDE ругалась на то, что
// мутабельный список должен быть инициализирован. По-другому не догнал, как сделать)