package org.example.lesson_9

fun main() {
    val numberOfIngredients = 5

    val userIngredients = mutableListOf("")
    repeat(numberOfIngredients) {
        userIngredients.add(readln())
    }

    userIngredients.removeAt(0)
    userIngredients.sort()
    val ingredients = userIngredients.toSet()
    var strIngredients = ingredients.joinToString(", ")
    strIngredients = strIngredients.replaceFirstChar { it.uppercase() }

    println(strIngredients)
}