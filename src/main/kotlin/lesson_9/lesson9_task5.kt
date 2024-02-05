package org.example.lesson_9

fun main() {
    val userIngredients = mutableListOf("")
    for (i in 1..5) {
        userIngredients.add(readln())
    }

    userIngredients.removeAt(0)
    userIngredients.sort()
    val ingredients = userIngredients.toSet()
    var strIngredients = ingredients.joinToString(", ")
    strIngredients = strIngredients.replaceFirstChar { it.uppercase() }

    println(strIngredients)
}